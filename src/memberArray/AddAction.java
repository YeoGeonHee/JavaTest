package memberArray;

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
		MemberVo[] temp = new MemberVo[MemberMain.members.length+1];
		for(int i=0;i<MemberMain.members.length;i++) {
			temp[i] = MemberMain.members[i]; //기존회원 복사
		}
		temp[temp.length -1] = member;
		MemberMain.members = temp;
	}

}
