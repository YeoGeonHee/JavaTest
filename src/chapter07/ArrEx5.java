package chapter07;

public class ArrEx5 {

	public static void main(String[] args) {
        // 두번째 인덱스 생략 가능
        int[][] arrInt = new int[3][];

        arrInt[0] = new int[] {1};
        arrInt[1] = new int[] {2,3};
        arrInt[2] = new int[] {4,5,6};

        for (int i=0; i<arrInt.length; i++) {
            for (int j=0; j<arrInt[i].length; j++) {
                System.out.print(arrInt[i][j]);
            }
            System.out.println();
        }



	}

}
