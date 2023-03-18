package package1;

import java.util.Scanner;

public class RecursionPrimeOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number:");
		int n = s.nextInt();
		int x = prime(n, 2);
		if (x == 1) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not prime number");
		}
	}

	static int prime(int y, int i) {
		if (i < y) {
			if (y % i != 0) {
				return (prime(y, ++i));
			} else {
				return 0;
			}
		}
		return 1;
	}
}
