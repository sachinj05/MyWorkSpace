package Roughs;

import java.util.Scanner;

public class StrRevWordsPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("New-->  "+rev(str)); 
	}

	private static String rev(String str) {
		String res ="";
		String space = " ";
		String[] s = str.split(" ");
		for (int i = s.length-1; i >= 0; i--) {
			res+=s[i]+space;
		}
		return res;
		
	}

}
