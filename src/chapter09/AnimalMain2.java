package chapter09;

import java.util.ArrayList;

public class AnimalMain2 {

	public static void main(String[] args) {
		// ArrayList 사용
		ArrayList<Animal> ani = new ArrayList<Animal>();
		Animal eagle = new Eagle("조류","독수리");
		Animal tiger = new Tiger("포유류","호랑이");
		Animal lion = new Lion("포유류","사자");
		Animal shark = new Shark("어류","상어");
		Apple apple = new Apple();
		
		ani.add(eagle);
		ani.add(tiger);
		ani.add(lion);
		ani.add(shark);
		
		
		
		System.out.println(ani.size());
		
		for(int i=0;i<ani.size();i++) {
			Animal a = ani.get(i);
			a.sleep();	
		}
		for(Animal a:ani) {
			a.sleep();
		}
	}

}
