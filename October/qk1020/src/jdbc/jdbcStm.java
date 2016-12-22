package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcStm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String driver = getProperty("db.driver");
			Class.forName(driver); // 加载驱动程序
			String url = getProperty("db.url");
			String u = getProperty("db.username");
			String p = getProperty("db.password");
			conn = DriverManager.getConnection(url, u, p); // 打开数据库连接

			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from player ");
			
			while(rs.next()){  					//移动游标
				String id=rs.getString("id");
				String name=rs.getString("name");
				String score=rs.getString("score");
				System.out.println("player: id="+id+",name="+name+",score="+score);
			}
				
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	private static String getProperty(String key) { // 读入文件
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("jdbc.properties"));
			return props.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
