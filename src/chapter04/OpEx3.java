package chapter04;

public class OpEx3 {

	public static void main(String[] args) {
		
		//결과값이 실수로 연산되게하는 방법
		int a = 10;
		int b = 4;
		System.out.println("10 / 4 = " + a / b);
		System.out.println("10 / 4 = " + (double)a / b);
		
		// char 연산
		char c1 = 'a';
		char c2 = 'b';
		int c3 = c1 + c2; //자동형변환
		int c4 = (int)c1 + (int)c2; //자동형변환
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		
		  // 문자열 덧셈
		
		String s1 = "Hello";
		String s2 = "World!!";
		String s3 = s1 + " " + s2;
		System.out.println(s3);
		
		 // 음수 사용
		int c = -a;
		System.out.println("c = " + c);
		
		int year = 0, age = 28;
		year = age + 2000;
		System.out.println(year);
	}

}
