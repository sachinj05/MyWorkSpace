package date5_12;

import java.util.Scanner;

public class XylemPhloem {

	static boolean isXylemPhloem(int x) {
		int last = x % 10;
		int temp = x;
		int median = 0;
		x = x / 10;
		while (x >= 9) {
			int d = x % 10;
			median = median + d;
			x = x / 10;
		}
		int mean = x + last;
		return mean == median;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean rs = isXylemPhloem(n);
		if (rs)
			System.out.println(n + " is Xylem");
		else
			System.out.println(n + " is Phloem");

	}

}
