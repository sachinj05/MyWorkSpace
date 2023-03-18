package Raghu_Sir;

import java.util.Scanner;

public class InchToFeet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in inch: ");
		int s = sc.nextInt();

		int x = s / 12;
		int y = s % 12;

		System.out.println("It's " + x + " feet and " + y + " inches");
	}
}
