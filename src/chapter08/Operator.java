package chapter08;

public class Operator {
	
	int multiply(int x, int y) {
		System.out.println("(int,int)");
		return x * y;
	}
	
	double multiply(int x, double y) {
		System.out.println("(int, double)");
		return x * y;
	}
	double multiply(double x, double y) {
		System.out.println("(double, double)");
		return x * y;
	}

}
