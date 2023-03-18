package Priyadarshan_Sir;

import java.util.Arrays;

public class MergeTheArray {
	public static void main(String[] args) {
	int [] arr1 = {123,5,92,61};
	int [] arr2 = {46,37,88};
	int [] arr3 = new int[7];
	
	for(int i=0; i<arr1.length; i++) {
				arr3[i] = arr1[i];
	}
	
	for(int i=0; i<arr2.length; i++) {
		arr3[i+4] = arr2[i];
     }
	
	for(int i=0; i<arr3.length; i++)
        System.out.println(arr3[i]);
	
	System.out.println(Arrays.toString(arr3));
	
	}
}
