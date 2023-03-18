package Roughs;

import java.util.Scanner;

public class Palistr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		boolean rs = isPanagram(str);
		if (rs==true) {
			System.out.println("panagram");
		} else
			System.out.println("not panagram");

	}

	private static boolean isPanagram(String str) {
		if (str.length() < 26) {
			return false;
		}

		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				count[ch - 97]++;
			} else if (ch >= 'A' && ch <= 'Z') {
				count[ch - 65]++;
			}

		}

		for (int i = 0; i < 26; i++) 
			if (count[i] == 0) 
				return false;
			
		
		return true;
	}

}
