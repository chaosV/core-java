package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class sqlInjection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadDriverClass();
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
	
		try {
			conn=getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from player");
			while(rs.next()){
				String id=rs.getString("id");
				String name=rs.getString("name");
				int score=rs.getInt("score");
				System.out.println("player: id="+id+",name= "+name+",score="+score);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			cleanup(conn, stmt, rs);

		}
		
		PreparedStatement ps=null;
		
		try {
			conn=getConnection();
			ps=conn.prepareStatement("select * from player where id=?");
			ps.setInt(1, 2);    //‘§±‡“Î
			rs=ps.executeQuery();
			while(rs.next()){
				String id=rs.getString("id");
				String name=rs.getString("name");
				int score=rs.getInt("score");
				System.out.println("player: id="+id+",name="+name+",score="+score);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			cleanup(conn, ps, rs);
		}
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("username: ");
		String username=scanner.nextLine();
		System.out.println("password:");
		String password=scanner.nextLine();
		
		try {
			conn=getConnection();
			stmt=conn.createStatement();
			String sql="select * from player where username = '"+username+"' and password= '"+password+"'";
			System.out.println("sql:"+sql);
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				String id=rs.getString("id");
				String name=rs.getString("name");
				int score=rs.getInt("score");
				System.out.println("player:id="+id+",name="+name+",score="+score);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			cleanup(conn,stmt,rs);
			scanner.close();
		}
		
		
	}
	private static void loadDriverClass(){
		String driver=getProperty("db.driver");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String getProperty(String key){
		Properties pros=new Properties();
		try {
			pros.load(new FileInputStream("jdbc.properties"));
			return pros.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return "";

	}
	
	private static Connection getConnection(){

		
		try {
			String url=getProperty("db.url");
			String u=getProperty("db.username");
			String p=getProperty("db.password");
			return DriverManager.getConnection(url,u,p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
	}
	private static void cleanup(Connection conn,Statement stmt,ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(stmt!=null){
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
