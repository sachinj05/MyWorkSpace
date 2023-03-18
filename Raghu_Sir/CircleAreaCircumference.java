package Raghu_Sir;

import java.util.Scanner;

public class CircleAreaCircumference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radious of Circle: ");
		float r = sc.nextFloat();
		float pi = 3.14f;
		
		float area = pi*r*r;
		float circumference = 2*pi*r;
		
		System.out.println("Area of Circle is: "+area);
		System.out.println("Circumference of Circle is: "+circumference);

	}

}
