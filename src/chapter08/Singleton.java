package chapter08;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton( ) {
		System.out.println("instance 생성");
	}
	
	public static Singleton getInstance() {
		return instance;
	}

}
