package Roughs;

import java.util.Scanner;

public class Desarium {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int n = sc.nextInt();
		boolean rs = isDesarium(n);
		if (rs) {
			System.out.println(n+" is desarium number");
		}else
			System.out.println(n+" is not desarium number");

	}

	private static boolean isDesarium(int n) {
		int temp=n,sum=0;
		int x = countD(n);
		do {
			int d=n%10;
			sum+=power(d,x);
			x--;
			n/=10;
		} while (n!=0);
		return sum==temp;
	}
	
	private static int power(int d, int x) {
		int pow=1;
		while (x!=0) {
			pow*=d;
			x--;
		}
		return pow;
	}

	static int countD(int n) {
		int count=0;
		while (n!=0) {
			count++;
			n/=10;
		}
		return count;
	}

}
