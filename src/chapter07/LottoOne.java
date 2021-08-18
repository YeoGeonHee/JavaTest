package chapter07;

import java.util.Arrays;

public class LottoOne {

	public static void main(String[] args) {
        int[] lottoBall = new int[45];

        for (int i=0; i < lottoBall.length ; i++ ) {
            lottoBall[i] = i+1;  // 배열을 1~45의 숫자로 초기화한다.
        }
        // 값 확인
        //System.out.println(Arrays.toString(lottoBall));

        // 값 섞기
        for (int i=0; i < 777; i++ ) {
            int n = (int)(Math.random() * 45);  // 0~44중의 한 값을 임의로 얻는다.

            int tmp = lottoBall[0];
            lottoBall[0] = lottoBall[n];
            lottoBall[n] = tmp;
        }
        // 값 확인
        //System.out.println(Arrays.toString(lottoBall));

        // 1장 뽑기
        int[] lotto1 = new int[6]; 
        for (int i=0; i < lotto1.length ; i++ ) {
            lotto1[i] = lottoBall[i];      
        }
        // 값 확인
        System.out.println(Arrays.toString(lotto1));



	}

}
