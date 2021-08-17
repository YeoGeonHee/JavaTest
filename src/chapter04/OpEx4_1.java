package chapter04;

import java.util.Scanner;

public class OpEx4_1 {

	public static void main(String[] args) {
		// String 값 비교
        // 리터럴
        String myName = "bar";
        String yourName = "bar";
        System.out.println(myName == yourName); // true
        System.out.println(myName.equals(yourName)); // true

        // 생성자 
        myName = new String("foo");
        yourName = new String("foo");
        System.out.println(myName == yourName); // false
        System.out.println(myName.equals(yourName)); // true
        System.out.println(myName.hashCode() + "/" + yourName.hashCode());

        // 외부 입력
        System.out.println("name input > ");
        Scanner scan = new Scanner(System.in);
        myName = scan.next();
        yourName = scan.next();
        System.out.println(myName == yourName); // false
        System.out.println(myName.equals(yourName)); // true
        System.out.println(myName.hashCode() + "/" + yourName.hashCode());
	}

}
