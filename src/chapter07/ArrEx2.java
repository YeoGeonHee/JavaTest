package chapter07;

import java.util.Arrays;

public class ArrEx2 {

	public static void main(String[] args) {
		// data 준비 초기화
        int[] data = new int[100];
        for(int i=0; i<data.length; i++) {
            data[i] = i+1; 
        }
        System.out.println("data="+Arrays.toString(data));
		int sum=0;
		
		for(int i=0;i<data.length;i++) {
			sum = sum + data[i];
		}
		System.out.println("sum = " + sum);
		int evenSum =0;
		int oddSum =0;
		int triSum =0;
		
		for(int i=0;i<data.length;i++) {
			if(data[i]%3 == 0) {
				triSum = triSum + data[i];
			}
			if(data[i]%2 == 0) {
				evenSum = evenSum +data[i];
			}else {
				oddSum += data[i];
			}
		}
        System.out.println("sum="+sum);
        System.out.println("triSum="+triSum);
        System.out.println("evenSum="+evenSum);
        System.out.println("oddSum="+oddSum);

	}

}
