package Raghu_Sir;

import java.util.Scanner;

public class SquareAreaPeremeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side of Square: ");
		int s = sc.nextInt();
		
		int area = s * s;
		System.out.println("Area is: " + area);
		int bredth = 4 * s;
		System.out.println("Peremeter is: " + bredth);
	}

}
