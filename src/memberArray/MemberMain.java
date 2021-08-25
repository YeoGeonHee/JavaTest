package memberArray;

import java.util.Scanner;

public class MemberMain {

	static MemberVo[] members = new MemberVo[0];
	
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		do {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록보기");
			System.out.println("5. 종료");
			
			
			String command = sc.next();
			switch (command) {
			case "1": {
				System.out.println("회원가입 시작");
				Action action = new AddAction();
				 ms.process(action, sc);
				break;
			}
			case "2" :
				System.out.println("회원목록 보기");
				for(MemberVo m: MemberMain.members) {
					System.out.println(m);
				}
				break;
			case "5": {
				System.out.println("5");
				isStop = true;
			}
			
			}
		}while(!isStop);

	}

}
