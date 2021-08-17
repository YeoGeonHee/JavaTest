package chapter04;

public class OpEx4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// boolean rs = a > b;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		boolean c = a == b;
		System.out.println("c = "+c);
		boolean d = c == false;
		System.out.println("d = "+d);
		
		//주소가 같음
		String myName = "bar";
		String yourName = "bar";
		boolean r1 = myName == yourName; // 주소가같니?
		boolean r2 = myName.equals(yourName); // equals 를 써야한다, 값이같니?
		
		System.out.println(myName == yourName);
		System.out.println(r1);
		System.out.println(r2);
		
		//주소가 다름
		myName = new String("foo");//new 라고 붙으면 새로운 주소생성
		yourName = new String("foo");
		r1 = myName == yourName;
		r2 = myName.equals(yourName);
		System.out.println(r1); // false
		System.out.println(r2); // true
	}

}
