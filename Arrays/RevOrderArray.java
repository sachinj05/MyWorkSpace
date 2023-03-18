package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RevOrderArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		rev(arr);
		System.out.println(Arrays.toString(arr));
		

	}

	private static void rev(int[] arr) {
		int temp=0;
		int i=0, j=arr.length-1;
		while (i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
		
		
	}


}
