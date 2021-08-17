package chapter06;

public class MethodEx1 {
	public static int add(int x1, int x2) {
		int y = x1*x2;
		return y;
	}

	public static void addprint(int x) {
		int y=x+x;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		//int a = add(4,10);
		//System.out.println(a);
		///addprint(100);
		int a = 10, b = 20;
		int y = add(a,b);
		System.out.println(y);
		
		a=28;
		b=124;
		y=add(a,b);
		System.out.println(y);
	}
}
