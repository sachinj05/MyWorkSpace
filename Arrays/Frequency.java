package Arrays;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter " + size + " values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		freq(arr);

	}

	private static void freq(int[] arr) {
		int big = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (big<arr[i]) {
				big = arr[i];
			}
		}
		
		int[] count = new int[big+1];
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		
		for (int i = 0; i < count.length; i++) {
			if (count[i]!=0) {
				System.out.println(i+"------->"+count[i]);
			}
		}
		
		
	}
}
