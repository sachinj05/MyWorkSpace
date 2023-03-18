package Raghu_Sir;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mark of 4 subs between 1 to 100 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
	
		int avg = (a+b+c+d)/4;
		if(a<35 || b<35 || c<35 || d<35)
			System.out.println("Faild");
		else if(avg>=85)
			System.out.println("Distinct percentage = "+avg);
		else if(avg>=60)
			System.out.println("Firstclass percentage = "+avg);
		else if(avg>=50)
			System.out.println("2nd class percentage = "+avg);
		else if(avg>=35)
			System.out.println("Just Passed = "+avg);
		else
			System.out.println("Invalid");
		
	}
}
