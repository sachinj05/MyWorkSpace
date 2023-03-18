package Arrays;

import java.util.Scanner;

public class ArrBiggestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter " + size + " Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		int big = bigofArr(arr);
		System.out.println("Biggest element of array is: " + big);

	}

	static int bigofArr(int[] x) {

		int max = x[0];

		for (int i = 0; i < x.length; i++) {
			if (max < x[i])
				max = x[i];

		}
		return max;

	}

}
