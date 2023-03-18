package StringPackage;

import java.util.Scanner;

public class FindFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence: ");
		String str = sc.nextLine();
		boolean rs = isPanagram(str);
		if (rs) {
			System.out.println("pana");
		}
		else
			System.out.println("Not pana");
		
	}
	private static boolean isPanagram(String str) {
		if (str.length()<26) {
			return false;
		}
		str=str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch)== -1) {
				return false;
			}			
		}
		return true;
	}
}
