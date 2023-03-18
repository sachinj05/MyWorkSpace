package Roughs;

import java.util.Scanner;

public class CustomException2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		try {
			charExcep(c);
		}
		catch(NotAlphabetException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void charExcep(char c) {
		if(c>='a'&& c<='z' || c>='A'&& c<='Z') {
			System.out.println("It is an alphabet");
		}else
			throw new NotAlphabetException();
			
		
	}

}
