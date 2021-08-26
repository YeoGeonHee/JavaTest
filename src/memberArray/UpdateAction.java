package memberArray;

import java.util.Scanner;

public class UpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("회원 정보 수정");
		
		System.out.print("수정할 ID : ");
		String id = sc.next();
		MemberVo member = null;
		MemberVo[] members = MemberMain.members;
		for(MemberVo m:members) {
			if(m.getId().equals(id)) {
				member = m;
				break;
			}
		}
		// id 가 있으면 PW,NAME,AGE 수정
		if(member != null) {
			System.out.println("기존 PW : " + member.getPw());
			System.out.print("수정할 PW : ");
			String pw = sc.next();
			System.out.println("기존 NAME : " + member.getName());
			System.out.print("수정할 NAME : ");
			String name = sc.next();
			System.out.println("기존 AGE : " + member.getAge());
			System.out.print("수정할 AGE : ");
			int age = sc.nextInt();	
			
			//1.setXXX()
			member.setPw(pw);
			member.setName(name);
			member.setAge(age);
			
			//2.MemberVo 주소변경
			MemberVo m = new MemberVo(member.getId(), pw, name, age);
			member = m;
			
		}else {
			System.out.println("없는 ID 입니다.");
		}
		
	}

}
