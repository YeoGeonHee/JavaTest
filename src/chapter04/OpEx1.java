package chapter04;

public class OpEx1 {

	public static void main(String[] args) {

		 int number1 = 10;
	     System.out.println("number1 = 10 -> "+number1); // 10출력

	     int number2 = number1;
	     System.out.printf("(number1, number2) -> (%s,%s)", number1, number2); // (10,10)출력
         System.out.println();
	     
	     number1 = number1 + 10;
	     number1 += 10; // 더하고 대입
	     System.out.println("number1 += 10 -> "+number1);

	     number1 = number1 - 10;
	     number1 -= 10; // 빼고 대입
	     System.out.println("number1 -= 10 -> "+number1); 

	     number1 = number1 * 2;
	     number1 *= 2; // 곱하고 대입
	     System.out.println("number1 *= 2 -> "+number1); 

	     number1 = number1 / 2;
	     number1 /= 2; // 나누고 대입
	     System.out.println("number1 /= 2 -> "+number1);

	     number1 = number1 % 3 ;
	     number1 %= 3 ; // 나머지 대입
	     System.out.println("number1 %= 3 -> "+number1); 

	}

}
