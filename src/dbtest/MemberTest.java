package dbtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MemberTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberVo> members = new ArrayList<MemberVo>();
		MemberVo member = null;
		
		conn = JDBCUtil.getConnection();
		
		String sql = "select id,pw,name,age ";
		sql += " from member " ;
		sql += " order by idx desc";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				//System.out.printf("%s,%s,%s,%s%n",id,pw,name,age);
				member = new MemberVo(id, pw, name, age);
				members.add(member);				
			}
			
			for(MemberVo m : members) {
				System.out.println(m.toString());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		
		

	}

}
