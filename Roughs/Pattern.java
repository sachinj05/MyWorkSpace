package Roughs;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int n = sc.nextInt();
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ( j==1||j==n || (i==j||i+j==n+1) && i>=n/2+1 ) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}




