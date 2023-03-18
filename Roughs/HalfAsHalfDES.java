package Roughs;

import java.util.Arrays;
import java.util.Scanner;

public class HalfAsHalfDES {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+ size + " values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Index:");
		int k = sc.nextInt();
		System.out.println(Arrays.toString(arr));
		sort(arr,k);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr,int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (i<=k) {
					if (arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
				}else {
					if (arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		
	}

}
