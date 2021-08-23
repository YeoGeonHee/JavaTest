package chapter12;

public class Fruit {
	String name;
    String color;
	public char[] toString;
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

        @Override
    public String toString() {
        return "과일 이름 : "+this.name+"\n과일 색상 : "+this.color;
    }
}