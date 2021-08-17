package chapter06;

public class WhileEx {

	public static void main(String[] args) {
		//1~10
		for(int i = 1; i <11; i++) {
			System.out.print(i);
		}
		System.out.println();
		int j = 1;
		while(true) {
			System.out.print(j);
			j++;
			if(j==11) {
				break;
			}
		}
		
	}

}
