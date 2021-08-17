package chapter07;

public class ArrEx {

	public static void main(String[] args) {
		

		//배열의 선언
		//int[] arrInt; //대중적 
	    //int arrInt2[];
	    //double[] arrDouble;
	    //String[] arrString;
		int[] score = new int[10];
		
		for(int i=0;i<score.length;i++) {
			score[i] = (i+1)*10;
		}
		for(int i=0;i<score.length;i++) {
			if(score[i] %2 == 1) {
			System.out.println(i);
		}		
	
		}
	    int[]intArr = {1,2,3,4,5};
	    
		int[]intArr2 = new int[5];
		intArr2[0] = 1;
		intArr2[1] = 2;
		intArr2[2] = 3;
		intArr2[3] = 4;
		intArr2[4] = 5;
		//위 두개는 똑같다.
	}
}

