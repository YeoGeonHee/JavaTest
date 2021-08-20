package chapter08;

public class LoginService {
	String id = "hong";
    String pw = "0000";
    
    
    boolean isLogin(String id, String pw, String name) {
        boolean rs = false;

        if(id.equals(this.id)) {
            if(pw.equals(this.pw)) {
                System.out.println("Welcom !! " + name );
                rs = true;
            }
        }

        return rs;
    }

    boolean isLogin(UserV0 user) {
        boolean rs = false;

        String id = user.getId();
        String pw = user.getPw();
        String name = user.getName();


        if(id.equals(this.id)) {
            if(pw.equals(this.pw)) {
                System.out.println("Welcom !! " + name );
                rs = true;
            }
        }

        return rs;
    }

}