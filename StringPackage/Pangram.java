package StringPackage;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String s = sc.nextLine();
		boolean rs = isPangram(s);

		if (rs==true)
			System.out.println("is a pangram");
		else
			System.out.println("is not a pangram");

	}

	private static boolean isPangram(String str) {
		if (str.length() < 26)
			return false;

		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z')
				count[ch - 65]++;
			else if (ch >= 'a' && ch <= 'z')
				count[ch - 97]++;

			
			}
		for (int i = 0; i < 26; i++) {
			if (count[i] == 0)
				return false;
		}

		return true;
	}

}
