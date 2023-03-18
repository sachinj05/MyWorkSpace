package Raghu_Sir;

import java.util.Scanner;

public class AllArithimaticOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 2 integer values: ");
		int x = sc.nextInt();  //8
		int y = sc.nextInt();  //5
		
		
		System.out.println("Sum is "+x+y);  //85
		System.out.println("Sum is "+(x+y));  //13

		
		//System.out.println("Diff is "+x-y);  //CTE
		System.out.println("Diff is "+(x-y));  //3

		System.out.println("Product is "+x*y);  //40
		System.out.println("Quotient is "+x/y);  //1
		System.out.println("Reminder is "+x%y);  //3

	}
}
