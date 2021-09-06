package memberArrayList;

import java.util.Scanner;

public class AddAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("회원 정보 입력");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NAME : ");
		String name = sc.next();
		System.out.print("AGE : ");
		int age = sc.nextInt();
		
		MemberVo member = new MemberVo(id, pw, name, age);
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		member.setAge(age);
		MemberMain.members.add(member);
	}

}
