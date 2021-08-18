package chapter07;

import java.util.Arrays;

public class ArrTest3 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i =0;i<numArr.length;i++) {
			numArr[i] = (int)(Math.random() * 10);//0~9
		}
		System.out.println(Arrays.toString(numArr));

		for(int j=0;j<numArr.length;j++) {
			boolean changed = false;
			for(int i=0;i<numArr.length-1-j;i++) {//-j는 맨뒤숫자 검사 횟수 줄여줌
				if(numArr[i] > numArr[i+1]) {
					//순서를 바꿔주는 수식
					int temp = numArr[i];
					numArr[i] = numArr[i+1];
					numArr[i+1] = temp;
					changed = true;
		}
		
		}
			System.out.println(Arrays.toString(numArr));
			if(!changed) {
				break;
			}
		}
		
	}

}
