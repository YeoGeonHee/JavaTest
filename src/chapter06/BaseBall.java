package chapter06;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		int com1 = 0;// 1~9
		int com2= 0;
		int com3= 0;
		int user1=0,user2=0,user3=0;
		int b = 0, s = 0, o = 0;
		int count = 0;
		
		while(true) {
			com1 = (int)(Math.random()*9) + 1;// 1~9
			com2=(int)(Math.random()*9) + 1;
			com3=(int)(Math.random()*9) + 1;
			// 중복 값 제거
			boolean check = com1 == com2 || com1 == com3 || com2 == com3;
			if(!check) {
				break;
			}
		}
		System.out.printf("%s%s%s\n", com1,com2,com3);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			count = count + 1;//1
			b = 0;
			s = 0;
			o = 0;
			
			System.out.println("3 자리(공백구분)>>");
			user1 = scanner.nextInt();
			user2 = scanner.nextInt();
			user3 = scanner.nextInt();
			
			if(user1 == com1) {
				s = s + 1;// 1
			}else if(user1 == com2) {
				b++;
			}else if(user1 == com3) {
				b++;
			}
			
			if(user2 == com1) {
				b++;// 1
			}else if(user2 == com2) {
				s++;
			}else if(user2 == com3) {
				b++;
			}
			
			if(user3 == com1) {
				b++;// 1
			}else if(user3 == com2) {
				b++;
			}else if(user3 == com3) {
				s++;
			}
			
			o = 3 - s + b;
			
			System.out.printf("%sS %sB %sO\n",s,b,o);
			
			if(s==3) {
				break;
			}
		}
		
		System.out.println(count + "번만에 빙고~~");
		
	}

}
