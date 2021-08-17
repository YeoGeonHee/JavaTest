package chapter5;

public class LoginTest {

	public static void main(String[] args) {
	    String id = args[0];
	    String passwd = args[1];

	    if(!id.equals("java")){
	        System.out.println("당신은 우리 회원이 아닙니다.");
	    }else if(!passwd.equals("java")){
	        System.out.println("비밀번호가 일치하지 않습니다.");
	    }else{
	        System.out.println("환영합니다.");
	    }
	}

}
