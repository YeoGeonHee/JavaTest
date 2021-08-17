package chapter04;

public class OpEx6 {

	public static void main(String[] args) {
		System.out.println("2:"+Integer.toBinaryString(2)); // 10진수 2를 2진수로 변환
        System.out.println("3:"+Integer.toBinaryString(3)); // 10진수 3을 2진수로 변환

        // 비트 논리연산
        System.out.println("2&3 : "+(2&3));
        System.out.println("2|3 : "+(2|3));
        System.out.println("2^3 : "+(2^3)); // XOR
        System.out.println("~3 : "+~3);

        // << 연산
        System.out.println(3 << 2);
        System.out.println("3의   이진수 : "+Integer.toBinaryString(3));
        System.out.println("12의 이진수 : "+Integer.toBinaryString(12));

        // >> 연산
        System.out.println(8 >> 2);
        System.out.println("8의   이진수 : "+Integer.toBinaryString(8));
        System.out.println("2의 이진수 : "+Integer.toBinaryString(2));      

	}

}
