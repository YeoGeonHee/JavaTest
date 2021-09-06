package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {

	public static Connection getConnection() {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		Connection conn = null;
		try {
			// 1. driver loading
			Class.forName(driver);
			// 2.conn
			String url = "jdbc:mysql://localhost:3306/bigdata?ServerTimezone=UTC";
			String user = "root";
			String password = "rootpass";
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Conn OK!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(PreparedStatement pstmt, Connection conn) {
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
