package chapter05;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("가위(1) 바위(2) 보(3) 중에 한개를 내세요");
		
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		int com = (int)(Math.random()*3+1);
		int rs = (user - com);
		System.out.println(com);

		System.out.println("당신은 "+ user +"입니다.");
		System.out.println("컴퓨터는 "+ com +"입니다.");
		
		if(rs == 2 || rs == -1) {
			System.out.println("당신이 졌습니다.");
		}else if (rs == 1 || rs == -2) {
			System.out.println("당신이 이겼습니다.");			
		}else {
			System.out.println("비겼습니다.");
		}
		
	}

}
