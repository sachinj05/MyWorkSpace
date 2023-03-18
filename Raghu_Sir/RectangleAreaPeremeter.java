package Raghu_Sir;

import java.util.Scanner;

public class RectangleAreaPeremeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of rectangle: ");
		int l = sc.nextInt();
		System.out.println("Enter Bredth of rectangle: ");
		int b = sc.nextInt();

		int area = l * b;
		System.out.println("Area is: " + area);
		int bredth = 2 * (l + b);
		System.out.println("Peremeter is: " + bredth);

	}

}
