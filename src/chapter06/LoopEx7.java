package chapter06;

import java.util.Scanner;

public class LoopEx7 {

	public static void main(String[] args) {
		//컴 : 랜덤숫자 0~100
		//유저 : 숫자 맞추기
		//데이터
		int com = (int)(Math.random()*100) + 1;
		int user = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		do {
			count++;
			System.out.println("숫자를 입력하세요>>");
			user = Integer.parseInt(scan.next()); 
			//제어문
			if(com > user) {
				System.out.println("숫자가 너무 작아요");
			}else if(com < user) {
				System.out.println("숫자가 너무 커요.");
			}else {
				System.out.println("정답입니다!");
				break;
			}
		}while(true);
		System.out.println(count + "번 만에 정답!!");

		//반복문
		

	}

}
