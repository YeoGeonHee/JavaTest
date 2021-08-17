package chapter06;

public class LoopTest1 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					System.out.printf("(%s,%s,%s)", i,j,k );
				}
				System.out.println();
				
			}
		}

	}

}
