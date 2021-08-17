package chapter06;

public class LoopEx4 {

	public static void main(String[] args) {
		String s = "*";
		for(int i =1; i<6; i++) {
			for(int j =0; j<i;j++) {
				System.out.print(s);
			}
			System.out.println();
		}

	}

}
