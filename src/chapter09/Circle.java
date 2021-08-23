package chapter09;

public class Circle extends Shape{
	int r;
	
	public Circle(int r) {
		super("Circle");
		this.r = r;
	}
	@Override
	double area() {
		return Math.PI * r * r;
	}
	@Override
	double length() {
		return 2 * Math.PI * r;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", type=" + type + "]";
	}
	
	
}
