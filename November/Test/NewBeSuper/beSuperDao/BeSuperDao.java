package beSuperDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import beSuperInfo.Player;
import beSuperInfo.PlayerCredential;


public class BeSuperDao{
	
	public BeSuperDao(){
		
	}
	
	public Player signup(PlayerCredential player){
		String sql="insert into 'qingke'.'player'('name','username','password') values (?,?,?)";
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			conn=getConnection();
			ps=conn.prepareStatement(sql);
			
			ps.setString(1,player.getName());
			ps.setString(2, player.getUsername());
			ps.setString(3, player.getPassword());
			
			int affectRows=ps.executeUpdate();
			if(affectRows>0){
				return login(player);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			cleanup(conn, ps, null);
			
		}
		return null;
	}
	
	public Player login(PlayerCredential credential) {
		
		String sql="select id,name,score from player where username=? and password=?";
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			conn=getConnection();
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, credential.getUsername());
			ps.setString(2, credential.getPassword());
			
			rs=ps.executeQuery();
			
			Player player=null;
			
			while(rs.next()){
				long id=rs.getLong("id");
				String name=rs.getString("name");
				int score=rs.getInt("score");
				
				player=new Player(id,name,score); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			cleanup(conn, ps, rs);
		}
		
		
		return credential;
	}

	public static Connection getConnection() throws SQLException{
		loadDriverClass();
		
		String url="jdbc:mysql://localhost:3306/qingke?useSSL=false";
		String username="qingke";
		String password="chaos";
		
		Connection conn=DriverManager.getConnection(url,username,password);
		return conn;
		
	}
	
	public static void loadDriverClass(){
		String driver="com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void cleanup(Connection conn,Statement stmt,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}