package dbtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	// db와 함께
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//sql
	private final String MEMBER_LIST = "select id,pw,name,age from member order by idx desc";
	private final String MEMBER_GET_ID = "select id,pw,name,age from member where id = ?";
	private final String MEMBER_INSERT = "insert into member(id,pw,name,age) values (?,?,?,?)";
	private final String MEMBER_UPDATE = "update member set pw=?,name=?,age=? where id=?";
	private final String MEMBER_DELETE = "delete from member where id = ?";
	
	public List<MemberVo> getMemberList(){
		List<MemberVo> members = new ArrayList<MemberVo>();
		MemberVo member = null;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(MEMBER_LIST);
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
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return members;
		
	}
	
	public MemberVo getMemberId(String id){
		MemberVo member = null;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(MEMBER_GET_ID);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				//System.out.printf("%s,%s,%s,%s%n",id,pw,name,age);
				member = new MemberVo(id, pw, name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return member;
		
	}
	
	public int insertMember(MemberVo m){
		int rs = 0;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(MEMBER_INSERT);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPw());
			pstmt.setString(3, m.getName());
			pstmt.setInt(4, m.getAge());
			rs = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		
		return rs;
		
	}
	
	public int updateMember(MemberVo m){
		int rs = 0;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(MEMBER_UPDATE);
			pstmt.setString(1, m.getPw());
			pstmt.setString(2, m.getName());
			pstmt.setInt(3, m.getAge());
			pstmt.setString(4, m.getId());
			rs = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		
		return rs;
		
	}
	
	public int deleteMember(String id){
		int rs = 0;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(MEMBER_DELETE);
			pstmt.setString(1, id);
			rs = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		
		return rs;
		
	}
	
	
	
	
	
	
}
