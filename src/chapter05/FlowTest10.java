package chapter05;

public class FlowTest10 {

	public static void main(String[] args) {
		
		// 주민번호 성별 판단
        String regNo = "111111-1111111";
        
        // 성별값 가져오기
        char r =  regNo.charAt(7);
        if(r=='1' || r=='3') {
        	System.out.println("남자");
        }else {
        	System.out.println("여자");
        }
	}

}
