package dbtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCUtilTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = JDBCUtil.getConnection();
		
		String cCode = "KOR";
		String sql = "select * ";
		sql += " from city where countrycode = ? ";
		sql += " and population > ? ";
		sql += " order by name";
		//stmt = conn.preparedS
		try {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		
		

	}

}
