package methodProbs;

import java.util.Scanner;

public class FactorialOfn {

	static int isFactor(int x) {
		int fact = x;

		do {
			x--;
			fact *= x;

		} while (x != 1);

		return fact;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isFactor(n));

	}

}
