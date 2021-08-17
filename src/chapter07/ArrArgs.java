package chapter07;

import java.util.Arrays;

public class ArrArgs {
	
	public static int[] arrReturn() {
		int[] arr = {0,2,4};
		return arr;
	}
	
	public static void arr2Xref(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
	}

	public static int[] arr2XNew(int[] arr) {
		int[] y = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			y[i] = arr[i] * 2;
		}
		return y;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		arr2Xref(arr);
		int[] y = arr2XNew(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(y));
		System.out.println(arr);
		System.out.println(y);

	}

}
