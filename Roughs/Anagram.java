package Roughs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter another String: ");
		String str2 = sc.nextLine();
		System.out.println("they are Anagram-->  " + anagram(str1, str2));

	}

	private static boolean anagram(String s1, String s2) {
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");
		if (s1.length() != s2.length()) {
			return false;
		}
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);

	}

}
