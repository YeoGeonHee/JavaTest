package testex;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요.");
		int score = sc.nextInt();
		
		if(score <= 100 && score > 0) {
			if(score >= 60) {
				System.out.println("합격입니다.");
			    }else {
				System.out.println("불합격입니다.");
			    }
		} else {
			System.out.println("점수 입력에 오류가 생겼어요!");
		
		sc.close();
	}

}

}