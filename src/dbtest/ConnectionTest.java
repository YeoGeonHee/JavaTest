package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		// conn, statement, resultset
		Connection conn = null; // db 연결
		Statement stmt = null; // sql query 창
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 결과 저장
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			// 1. driver loading
			Class.forName(driver);
			
			// 2.conn
			String url = "jdbc:mysql://localhost:3306/world?ServerTimezone=UTC";
			String user = "root";
			String password = "rootpass";
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Conn OK!!");
			// 3. sql 쿼리창
			// id,name,countrycode,district,population
			String cCode = "KOR";
			String sql = "select * ";
			sql += " from city "
					+ "where countrycode = ? ";
			sql += " and population > ? ";
			sql += " order by name";
			//stmt = conn.preparedS
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cCode);
			pstmt.setInt(2, 1000000);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String countrycode = rs.getString("countrycode");
				String district = rs.getString("district");
				int population = rs.getInt("population");
				System.out.printf("%s,%s,%s,%s,%s%n",id,name,countrycode,district,population);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	

}
