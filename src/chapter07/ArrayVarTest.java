package chapter07;

import java.util.Arrays;

public class ArrayVarTest {

	public static void main(String[] args) {
		

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;

        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
        System.out.println("arr1="+Arrays.toString(arr1));
        System.out.println("arr2="+Arrays.toString(arr2));

        arr1[0] = 100;
        arr2[4] = 500;

        System.out.println("arr1="+Arrays.toString(arr1));
        System.out.println("arr2="+Arrays.toString(arr2));
}
}