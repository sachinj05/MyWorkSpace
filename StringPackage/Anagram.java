package StringPackage;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter one String: ");
		String s1 = sc.nextLine();

		System.out.println("Enter another String: ");
		String s2 = sc.nextLine();

		boolean rs = isAanagram(s1, s2);

		if (rs)
			System.out.println("is an Anagram");
		else
			System.out.println("is not an Anagram");

	}

	static int[] countFreq(String str) {
		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z')
				count[ch - 65]++;
			else if (ch >= 'a' && ch <= 'z')
				count[ch - 97]++;

		}
		return count;

	}

	private static boolean isAanagram(String str1, String str2) {

		int[] arr1 = countFreq(str1);
		int[] arr2 = countFreq(str2);
		for (int i = 0; i < 26; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}

		return true;
	}

}
