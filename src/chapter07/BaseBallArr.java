package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBallArr {

	public static void main(String[] args) {
	        // com => random()
	        // 0 ~0.9999999999 * 9 + 1
	        int[] com = new int[3];
	        // Scanner
	        int[] user = new int[3];
	        // S, B, O
	        int strike=0, ball=0, out=0;
	        boolean check = false;// 비중복
	        while(true) {
	            for(int i=0;i<3;i++) {
	                com[i] = (int)(Math.random() * 9)+1;
	            }
	            check = isCheck(com);//f 
	            if(!check) {
	                break;
	            }
	        }
	        System.out.println(Arrays.toString(com));
	        Scanner sc = new Scanner(System.in);
	        String[] s = {"첫","두","세"};
	        while(true) {
	            strike = 0;
	            ball = 0; 
	            out = 0;

	            for(int i=0;i<user.length;i++) {
	                System.out.println(s[i]+"번째 숫자를 넣으세요(1~9).>");
	                user[i] = sc.nextInt();
	            }

	            check = isCheck(user);
	            System.out.println("check="+check);
	            if(check) {//t
	                System.out.println("중복값 넣지마세요!");
	                continue;
	            }   

	            for(int i=0;i<com.length;i++) {
	                for(int j=0;j<user.length;j++) {
	                    if(com[i] == user[j]) {
	                        //s, b
	                        if(i==j) {
	                            strike++;
	                        }else {
	                            ball++;
	                        }
	                    }
	                }

	            }

	            out = 3 - (strike + ball);

	            System.out.printf("%sS %sB %sO%n",strike,ball,out);     
	            if(strike == 3) {
	                break;
	            }
	        }
	        System.out.println("빙고~~~");
	    }

	    // 중복값 처리 메서드
	    // true : 중복, false : 비중복
	    static boolean isCheck(int[] n) {
	        boolean check = false;
//	      // 중복처리
	        if((n[0]==n[1] || n[0]==n[1] || n[1]==n[2])) {
	            check = true;
	        }
	        return check;
	    }

	}