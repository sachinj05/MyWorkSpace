package Raghu_Sir;

import java.util.Scanner;

public class Special2digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter one 2 digit integer value: ");
		int n = sc.nextInt();
		
		int d1 = n/10;
		int d2 = n%10;
		
		int sum = d1+d2+d1*d2;
		if (sum == n)
			System.out.println(n +" is a special 2 digit number");
		else
			System.out.println(n +" is not a special 2 digit number");

	}

}
