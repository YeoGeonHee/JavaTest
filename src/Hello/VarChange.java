package Hello;

public class VarChange {

	public static void main(String[] args) {
		String cupA = "red";
		String cupB = "blue";
		String cupT = cupA;
		
				
		cupA = cupB;
		cupB = cupT;
		
		System.out.println(cupA);
		System.out.println(cupB);
	}

}
