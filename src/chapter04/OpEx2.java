package chapter04;

public class OpEx2 {

	public static void main(String[] args) {
	    int a = 10;
	    int b;
	    // 증감연산
	    a = a + 1; // a +=1; ,a++; , ++a; 다 같음
	    System.out.println(a);
	    b = ++a;
	    System.out.printf("(%d,%d)", a, b);
	    b = a++; // 왼쪽부터 값을 내기때문에 b를 먼저 구하고 a를 추가한다
	    System.out.printf("(%s,%s)", a, b);
	}

}
