package chapter09;

public class PolyEx {

	public static void main(String[] args) {
		Child c = new Child();
		c.run();
		c.walk();
		c.game();
		System.out.println(c.name); // 자식
		
		Parent p = new Child();
		System.out.println(p.name);
		p.walk(); // 부모님
		p.run(); // 자식
		//p.game(); error
		
		c =(Child) p; //강제형변환
		c.game();
	}

}
