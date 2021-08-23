package chapter12;

public class ToStringEx {
	public static void main(String[] args) {
        Fruit f = new Fruit("사과", "빨강");
        System.out.println(f); // f.toString() 자동으로 불려짐
        System.out.println(f.toString); 
    }
}