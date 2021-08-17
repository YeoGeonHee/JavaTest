package chapter06;

public class LoopEx3 {

	public static void main(String[] args) {
		for(int i =1; i<26; i++) {
			String p = "";
			if(i<10) {
				p = "  " + i;
			}else {
				p = " " + i;
			}
			System.out.print(p);
			if(i%5 == 0) {
				System.out.println();				
				
		}

		}


	}

}
