package chapter03;

public class CastingEx {

	public static void main(String[] args) {
		int number = 10;
		long number2 = number;
		float number3 = number2;
		
		System.out.println(number3);
		
		double pi = 3.14;
		int pi2 = (int)pi;
		System.out.println(pi2);
		
		String s1 = "1";
		String s2 = "2";
		int i1 = Integer.parseInt(s1); //문자열 =>숫자로
		int i2 = Integer.parseInt(s2); //문자열 =>숫자로
		System.out.println(i1+i2);
		
		int a1 = 10;
		a1 = a1 + 10;
		a1 = a1 + 10;
		a1 = a1 + 10;
		a1 += 10;
		System.out.println(a1);
		
		int n = 5;
		int a = n % 2;
		System.out.println(a == 0);
		
	
	}

}
