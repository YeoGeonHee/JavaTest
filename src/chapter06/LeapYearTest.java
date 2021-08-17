package chapter06;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		//윤년 판별 : 판별식 : 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("연도>");
			int year = scanner.nextInt(); // 윤년
			boolean isLeap = year % 400 ==0 || (year % 4 ==0 && year % 100 != 0);
			if(isLeap) {
				System.out.println("윤년 입니다.");
			}else {
				System.out.println("윤년이 아닙니다.");
			}
			if(isLeap) {
				break;
			}

		}
	}

}
