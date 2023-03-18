package Roughs;


import java.util.Scanner;

public class Duck {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			String str = sc.nextLine();
			System.out.println(isDuck(str));
			
			
	}

	private static String isDuck(String str) {
		if (str.charAt(0)=='0') {
			return "is not duck";
		}
		int count=0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i)=='0') {
				count++;
			}

		}
		if (count>0) {
			return "is duck";
		}
		else
			return "is not duck";
			
		
	}

}
