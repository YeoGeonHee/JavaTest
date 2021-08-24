package chapter15;

public class LambdaFunctionEx {
	public static void main(String[] args) {

        // 람다식
InterfaceEx ie = (int x, int y) -> x+y;

System.out.println(ie.sum(1, 2));

}

}

//함수적 인터페이스
interface InterfaceEx {
public int sum(int x, int y);
}