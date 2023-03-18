package Roughs;

import java.util.Arrays;

public class sortarrrr {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,289,2903,9330,2883,9,9,9,2,4,5,6,6};
		System.out.println(Arrays.toString(arr));
		int index = 10;
		sortArr(arr,index);
		System.out.println(Arrays.toString(arr));

		
		
	}

	private static void sortArr(int[] arr, int k) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(i<=k) {
					if (arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}else
					if (arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				
				
			}
		}
		
	}

}
