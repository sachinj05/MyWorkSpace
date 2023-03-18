package Roughs;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numb: ");
		int n = sc.nextInt();
		boolean rs = isNum(n);
		if (rs) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
	}

	private static boolean isNum(int n) {
		for (int i = 1; i < n/2; i++) {
			if (power(2, i)==n) {
				return true;
			}
			
		}
		return false;
	}

	private static int power(int x, int y) {
		int pow = 1;
		while(y!=0) {
			pow*=x;
			y--;
		}
		
		
		return pow;
	}

}
