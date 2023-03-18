package Roughs;

import java.util.Scanner;

public class xylem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check xylem or phloem:");
		int n = sc.nextInt();
		int side = n%10;
		int mid = 0;
		n = n/10;
		
		while(n>=9) {
			int d = n%10;
			mid+=d;
			n=n/10;
		}
		side+=n;
		
		System.out.println(side+"======="+mid);
	}

}
