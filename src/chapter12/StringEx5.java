package chapter12;

public class StringEx5 {
	
	static String s1;
    static String s2 = "";

    public static void main(String[] args) {

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("s2.length():"+s2.length());
        System.out.println("".equals(s2));
    }
}