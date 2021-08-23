package chapter09;

public class ShapeEx {

	public static void main(String[] args) {
//		Shape shapes = new Circle(10);
//		System.out.println(shapes.area());
//		System.out.println(shapes.length());
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(10, 10);
		for(Shape s : shapes) {
            System.out.println(s);
            System.out.println("넓이:"+s.area()+" 둘레:"+s.length());
        }
    }
}