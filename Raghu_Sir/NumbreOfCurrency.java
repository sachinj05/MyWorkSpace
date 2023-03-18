package Raghu_Sir;

import java.util.Scanner;

public class NumbreOfCurrency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter indian currency: ");
		int n = sc.nextInt();
		
		int a = n/2000;System.out.println("Num of 2000rs note = "+a);
		n = n%2000;
		
		int b = n/500;System.out.println("Num of 500rs note = "+b);
		n = n%500;
		
		int c = n/200;System.out.println("Num of 200rs note = "+c);
		n = n%200;
		
		int d = n/100;System.out.println("Num of 100rs note = "+d);
		n = n%100;
		
		int e = n/50;System.out.println("Num of 50rs note = "+e);
		n = n%50;
		
		int f = n/20;System.out.println("Num of 20rs note = "+f);
		n = n%20;
		
		int g = n/10;System.out.println("Num of 10rs note = "+g);
		n = n%10;
		
		int h = n/5;System.out.println("Num of 5rs note = "+h);
		n = n%5;
		
		int i = n/2;System.out.println("Num of 2rs note = "+i);
		n = n%2;
		
		int j = n/1;System.out.println("Num of 1rs note = "+j);
		
		
	}

}
