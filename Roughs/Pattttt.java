package Roughs;

import java.util.Scanner;

public class Pattttt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1 ;j <= n; j++) {
				if(i==1||j==1||i==n||j==n||i==j||i+j==n+1)
//				if(i==1||j==1||i==n||j==n||i==n/2+1||j==n/2+1)
//				if(i==j||i+j==n+1||i==n/2+1||j==n/2+1)
//				if(j==1||j==n|| (i==j||i+j==n+1) &&i<=n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}

//* * * * *     //* * * * *
//* * 1 * * 	//* 2 *   *
//*   *   * 	//* * * * * 
//* *   * * 	//*   *   * 
//* * * * * 	//* * * * * 

//* 3 *   * 	//*   4   * 
//  * * *   	//* *   * * 
//* * * * * 	//*   *   * 
//  * * *   	//*       * 
//*   *   *		//*       * 