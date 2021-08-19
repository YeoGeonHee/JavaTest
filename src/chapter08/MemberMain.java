package chapter08;

public class MemberMain {

	public static void main(String[] args) {
		//클래스 사용 방법
		Member m = new Member();
		Member m2 = new Member();
		
		if(m == m2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
	}
}
