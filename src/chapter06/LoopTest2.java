package chapter06;

public class LoopTest2 {
 
	public static void main(String[] args) {
	
		for(int i=1; i<6;i++) {
			for(int j=0; j<5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//구구단 2~9단
	
		for(int i=2; i<10;i++) {	
			//if(i==4) break;  3단까지만하고 빠질때 위치차이 중요
			System.out.println("===" + i + "단===");		
		    for(int j=1; j<10; j++) {
			   System.out.printf("%s * %s = %s\n",i,j,i*j);
		   }
		    //if(i==3) break;  3단까지만하고 빠질때 위치차이 중요
		}   
}
}
