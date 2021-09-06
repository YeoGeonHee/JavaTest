package dbtest;

import java.util.List;

public class MemberTest2 {

	public static void main(String[] args) {
		// db member 목록을 보여주세요

		MemberDAO dao = new MemberDAO();

		// 전체 목록
		List<MemberVo> members =  dao.getMemberList();
		MemberVo member = null;
		String id = "hong5";
		String pw = "6161";
		String name = "홍길동61";
		int age = 61;
		member = new MemberVo(id, pw, name, age);
		int rs = 0;
		// insert
		//int rs = dao.insertMember(member);
		//System.out.println("rs = " + rs);

		// update
		//rs = dao.updateMember(member);
		//System.out.println("rs = " + rs);

		// update
		rs = dao.deleteMember(id);
		System.out.println("rs = " + rs);

		members = dao.getMemberList();		
		for(MemberVo m: members) {
			System.out.println(m.toString());
		}

		// 1개
		member = dao.getMemberId(id);
		System.out.println(member);





	}

}
