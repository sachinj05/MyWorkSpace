package Arrays;

import java.util.Scanner;

public class ArrSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter " + size + " Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		int sum = sumofArr(arr);
		System.out.println("Sum of array is: " + sum);

	}

	static int sumofArr(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;

	}

}
