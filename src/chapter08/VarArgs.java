package chapter08;

public class VarArgs {
	
	void printInfo(String...infos) {
		if(infos.length != 0) {
			for(String s:infos) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		va.printInfo("aaa","bbb");

	}

}
