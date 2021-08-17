package chapter06;

public class ContinueEx {

	public static void main(String[] args) {

        // 5만 건너 띄고 다시 증감->조건 판별 후 진행
 for (int i=0; i<10; i++) {
     if (i == 5) {
         continue;
     }
     System.out.println(i);
 }

         // 홀수는 건너 띄고 다시 조건 판별 후 진행
 int i = 0;
 while (i<10) {

     if(i % 2 == 1) {
         i++;
         continue;
     }
     System.out.println(i);
     i++;

 }

	}

}
