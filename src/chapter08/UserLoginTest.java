package chapter08;

import java.util.Scanner;

public class UserLoginTest {

	public static void main(String[] args) {
		boolean rs = false;

		
        Scanner scan = new Scanner(System.in);

        System.out.println("id >>> ");
        String id = scan.next();

        System.out.println("pw >>> ");
        String pw = scan.next();


        System.out.println("name >>> ");
        String name = scan.next();

        LoginService ls = new LoginService();

        // 각각의 인자 사용
        rs = ls.isLogin(id, pw, name);

        if(rs) {
            System.out.println("login success");
        }else {
            System.out.println("login fail");
        }

        // VO 사용
        UserV0 user = new UserV0(id, pw, name);
        rs = ls.isLogin(user);

        if(rs) {
            System.out.println("login success");
        }else {
            System.out.println("login fail");
        }

    }

}