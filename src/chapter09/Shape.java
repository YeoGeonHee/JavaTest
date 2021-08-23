package chapter09;

public abstract class Shape {
    String type;
    Shape(String type) {
        this.type = type;
    }
    abstract double area();
    abstract double length();
}
