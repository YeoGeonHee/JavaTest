package chapter12;

public class StringBufferEx {
	public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("abcd");
        System.out.println("문자열 연결전 sb1 = "+System.identityHashCode(sb1));
        sb1.append("efgh");
        System.out.println("문자열 연결후 sb1 = "+System.identityHashCode(sb1));

        // StringBuffer 클래스 equals() 재정의 안되어 있음
        System.out.println(sb1.toString().equals("abcdefgh"));



    }

}