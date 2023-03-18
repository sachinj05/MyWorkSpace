package PracticeString;

import java.util.Scanner;

public class HowManyWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int res = countWords(str);
		System.out.println(res + " words present");
	}

	private static int countWords(String str) {
		str = str.trim();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		return count;
	}

}
