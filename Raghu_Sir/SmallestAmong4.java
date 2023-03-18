package Raghu_Sir;

import java.util.Scanner;

public class SmallestAmong4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 Double type value:");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		double x = Math.min(a, b);
		double y = Math.min(c, d);
		
		double z = Math.min(x, y);
		System.out.println(z);




	}

}
