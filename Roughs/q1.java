package Roughs;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		frequence(arr);
		
	}

	private static void frequence(int[] arr) {
		boolean[] ar = new boolean[arr.length] ;
		for (int i = 0; i < arr.length; i++) {
			if (ar[i]==false) {
				int count = 1;
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i]==arr[j]) {
						count++;
						ar[i+1]=true;
					}
				}
				if (ar[i]==true) {
					System.out.println(arr[i]+" is present "+count+" times");

				}
	
			}
		}
	
	}

}
	