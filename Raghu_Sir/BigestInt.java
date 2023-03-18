package Raghu_Sir;

import java.util.Scanner;

public class BigestInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integer values: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int max = x;
		
		if(y>max)
			max = y;
		if(z>max)
			max = z;
		
		System.out.println(max+" is max");

	}
}
