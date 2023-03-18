package methodProbs;

import java.util.Scanner;

public class PerfectNum {
	static boolean perfect(int x) {
		int temp = x;
		int num = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0) {
				num += i;
			}
		}
		return temp == num;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = perfect(n);
		System.out.println(result);

	}

}
