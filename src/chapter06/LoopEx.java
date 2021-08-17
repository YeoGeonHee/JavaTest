package chapter06;

public class LoopEx {

	public static void main(String[] args) {
		// 1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오.

		int oddSum = 0;
		int evenSum = 0;
		for(int i=1; i<101; i++) {
			if(i%2 ==0) {
				evenSum += i;
			}else {
				oddSum +=i;
			}
		
		}
		System.out.println("evenSum = " + evenSum );
		System.out.println("oddSum = " + oddSum );
	}

}
