package chapter06;

public class LoopEx6 {

	public static void main(String[] args) {
		for(int x=0; x<11; x++) {
			for(int y=0; y<11; y++) {
				if(2*x + 4*y == 10) {
				System.out.printf("(%s,%s)", x,y);
				}	
				}
			System.out.println();
			
			}
			
	}

}
