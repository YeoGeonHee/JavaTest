package chapter09;

public class Rectangle extends Shape{
	int width, height;
    Rectangle(int width, int height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
    @Override
    double length() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return "Shape [type=" + type + ", width=" + width + ", height=" + height+"]";
    }

}