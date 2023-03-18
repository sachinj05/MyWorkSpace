package StringPackage;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter Sentence: ");

		String str = sc.nextLine();
		boolean rs = isPalindrome(str);
		if (rs==true) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is Not a Palindrome");

		}
	}

	private static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while (i<j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	}

}
