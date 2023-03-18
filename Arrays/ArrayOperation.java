package Arrays;

import java.util.Scanner;

public class ArrayOperation {
	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int size = sc.nextInt();

		System.out.println("Enter " + size + " elements: ");
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		return arr;
	}

	void dispArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	boolean isPrime(int n) {
		for (int i = 2; i <= n/2; i++) {
			if(n%i == 0)
				return false;			
		}return true;	
	}
	
	
	int countPrimeNumber(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			boolean rs = isPrime(arr[i]);
			if(rs == true)
				count++;
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	

}
