package chapter12;

public class StringBufferEx4 {
	public static void main(String[] args) {

        // 시작
        long start = System.currentTimeMillis();

        StringBuffer str = new StringBuffer();
        for (int i=0; i<100000000; i++) {
            str.append(i);
        }

        // 끝
        long end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000);

    }

}
