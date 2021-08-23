package chapter10;

public class ComploexTest {

	public static void main(String[] args) {
		Complexer c = new Complexer();
		
		c.scan();
		c.receive("02-3333-4444");
		c.send("02-4444-5555");
		c.print();

	}

}
