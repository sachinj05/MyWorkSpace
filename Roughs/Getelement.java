package Roughs;

import java.util.ArrayList;
import java.util.Scanner;

public class Getelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arraylist: ");
		int size = sc.nextInt();
		ArrayList al = new ArrayList(size);
		System.out.println("Enter element of arraylist: ");
		for (int i = 1; i <= size; i++) {
			String s =sc.next();
			al.add(s);
		}
		
		System.out.println();
		System.out.print("Enter the index: ");
		int index = sc.nextInt();
		System.out.println(al.get(index));
		
	}

}
