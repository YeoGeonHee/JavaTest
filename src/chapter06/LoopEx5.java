package chapter06;

public class LoopEx5 {

	public static void main(String[] args) {
		for(int i=1; i<7; i++) {
			for(int j=1; j<7; j++) {
				if(i+j ==6) {
					System.out.printf("(%s,%s)", i,j);
				}
				
			}
			System.out.println();
		}

	}

}
