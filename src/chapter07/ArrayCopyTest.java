package chapter07;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        // 배열 늘리기 - 기존 값 복사  
        int[] arr2 = new int[10];
        for(int i = 0;i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("arr2="+Arrays.toString(arr2));

        // 배열 늘리기 - System 클래스 arraycopy() 메소드 사용
        int[] arr3 = new int[10];
        System.arraycopy(arr2, 0, arr3, 0, arr1.length);
        System.out.println("arr3="+Arrays.toString(arr3));

        // 배열 늘리기 - System 클래스 arraycopy() 메소드 사용

        int[] arr4 = null;
        arr4 = Arrays.copyOf(arr1, arr1.length+5);
        System.out.println("arr4="+Arrays.toString(arr4));
	}

}
