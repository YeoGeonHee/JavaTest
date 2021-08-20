package chapter08;

public class LocalVarTest {

	public static void main(String[] args) {
		int n = 0;

        {
            int a = 10;
        }

        // int b = a; // error 블럭에서 선언된 a 지역변수 

        for(int i=0; i<3; i++) {
            int j = 3;
        }

        // int b = i; error for() 선언된 i, for블럭에 선언된 j 지역변수

    }

    public static void nUse() {
        //int k = n; // main()에 선언된 n 지역변수
    }

}