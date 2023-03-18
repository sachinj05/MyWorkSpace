package StringPackage;

import java.util.Scanner;

public class NumberofWords2 {
	public static void main(String[] args) {
		System.out.println("Enter Sentence: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("Number of words present = "+countWords(str));
	}

	private static int countWords(String str) {
		int count =1;
		str = str.trim();
		char ch [] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] !=' ' && ch[i-1]==' ') {
				count++;
			}
		}
		
		return count;
	}

}
