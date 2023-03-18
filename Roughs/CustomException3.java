package Roughs;

import java.util.Scanner;

public class CustomException3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		boolean rs = primeNum(x);
		try {
			if(rs==true)
				System.out.println("It is a prime Number");
			else {
				throw new NonPrimeException();
			}
		}
		
		catch (NonPrimeException e) {
			System.out.println(e.getMessage());
		}
	}

	static boolean primeNum(int n) {
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
		
	}

}
