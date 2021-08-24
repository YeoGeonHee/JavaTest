package chapter05;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("주사위를 굴려주세요.");
		
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		int com = (int)(Math.random()*6+1);
		System.out.println(com);
		int rs = (user - com);
		
		if(rs==-1 || rs==-2 || rs==-3 || rs==-4 || rs==-5) {
			System.out.println("당신이 졌습니다.");
		}else if (rs==1 || rs==2 || rs==3 || rs==4 || rs==5) {
			System.out.println("당신이 이겼습니다.");
		}else {
			System.out.println("비겼습니다.");
		}
		
	}

}
