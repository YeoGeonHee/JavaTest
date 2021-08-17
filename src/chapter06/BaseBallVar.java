package chapter06;

import java.util.Scanner;

public class BaseBallVar {

	public static boolean isCheck(int n1,int n2,int n3) {
		boolean check = n1==n2||n2==n3||n3==n1;
		return check;
	}
	
	public static void main(String[] args) {
		String s = "%sS %sB %sO %n";
        int com1 = 0;
        int com2 = 0;
        int com3 = 0;

        while(true) {
            com1 = (int)(Math.random() * 10);
            com2 = (int)(Math.random() * 10);
            com3 = (int)(Math.random() * 10);
            boolean check = isCheck (com1, com2, com3);
            if(!check) {
                break;
            }
        }
        System.out.printf("%s%s%s%n",com1,com2,com3);

        // 중복체크 필요
        int user1 = 0;
        int user2 = 0;
        int user3 = 0;

        int count = 0;
        // 중복체크 필요
        Scanner scan = new Scanner(System.in);
        while(true) {
            count++;
            int strike = 0;
            int ball = 0;
            int out = 0;
            while(true) {
                user1 = scan.nextInt();
                user2 = scan.nextInt();
                user3 = scan.nextInt();
                boolean check = isCheck (user1, user2, user3);
                if(!check) {
                    break;
                }
            }
            if(com1 == user1) {
                strike++;
            }else if(com1 == user2) {
                ball++;
            }else if(com1 == user3) {
                ball++;
            }

            if(com2 == user1) {
                ball++;
            }else if(com2 == user2) {
                strike++;
            }else if(com2 == user3) {
                ball++;
            }

            if(com3 == user1) {
                ball++;
            }else if(com3 == user2) {
                ball++;
            }else if(com3 == user3) {
                strike++;
            }

            out = 3 - (strike + ball);

            System.out.printf(s,strike,ball,out);


            if(strike == 3) {
                break;
            }
        }
        System.out.println("시도>>"+count+"번 빙고!!");



	}

}
