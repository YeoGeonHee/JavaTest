package chapter5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("가위(1) 바위(2) 보(3) 중 한개 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3+1);
		
		System.out.println("당신은 "+ user +" 입니다.");
		System.out.println("컴퓨터는 "+ com +"입니다.");
		
		switch(user-com) {
		    case 2: case -1:
		    	System.out.println("당신은 졌습니다.");
		    	break;
		    case 1: case -2:
		    	System.out.println("당신은 이겼습니다.");
		    	break;
		    case 0:
		    	System.out.println("비겼습니다.");
		}

	}

}
