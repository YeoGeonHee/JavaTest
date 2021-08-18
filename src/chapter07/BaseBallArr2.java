package chapter07;

import java.util.Scanner;

public class BaseBallArr2 {

    // 배열사용
    // getbBalls()메서드 생성  중복되지 않는 3개의 값을 리터하는 함수로변경

    public static boolean isCheck(int[] n) {
        boolean check = n[0] == n[1] || n[0] == n[2] || n[1] == n[2];
        return check;
    }

    public static int[] getBalls() {
        int[] balls = new int[3];

        while(true) {
            System.out.println("숫자를 선택 중....");
            for(int i=0;i<balls.length;i++) {
                balls[i] = (int)(Math.random()*9) + 1;// 1~9
            }
            // 중복 값 제거
            boolean check = isCheck(balls);
            if(!check) {
                System.out.println("숫자를 선택 완료!!");
                break;
            }

        }
        return balls;
    }

    public static void main(String[] args) {
        int[] com = new int[3];
        int[] user= new int[3];
        int b = 0, s = 0, o = 0;
        int count = 0;

//      while(true) {
//          for(int i=0;i<com.length;i++) {
//              com[i] = (int)(Math.random()*9) + 1;// 1~9
//          }
//          // 중복 값 제거
//          boolean check = isCheck(com);
//          if(!check) {
//              break;
//          }
//      }

        com = getBalls();

        System.out.printf("%s%s%s\n", com[0],com[1],com[2]);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            count = count + 1;//1
            b = 0;
            s = 0;
            o = 0;

            while(true) {
                System.out.println("3 자리(공백구분)>>");
                user[0] = scanner.nextInt();
                user[1] = scanner.nextInt();
                user[2] = scanner.nextInt();
                // 중복 값 제거
                boolean check = isCheck(user);
                if(!check) {
                    break;
                }
            }

            for(int i=0;i<user.length;i++) {
                for(int j=0;j<com.length;j++) {
                    if(user[i]==com[j]) {
                        if(i==j) {
                            s++;
                        }else {
                            b++;
                        }
                    }
                }
            }

            o = 3 - (s + b);

            System.out.printf("%sS %sB %sO\n",s,b,o);

            if(s==3) {
                break;
            }
        }

        System.out.println(count + "번만에 빙고~~");

    }

}
