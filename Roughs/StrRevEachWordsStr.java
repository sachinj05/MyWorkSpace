package Roughs;

import java.util.Scanner;

public class StrRevEachWordsStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("New-->  "+revEach(str)); 
	}

	private static String revEach(String str) {
		String res ="";
		String space = " ";
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			char [] ch = s[i].toCharArray();
			for (int j = ch.length-1; j >=0; j--) {
				res+=ch[j];
			}
			res+=space;
		}
		return res;
		
	}

}
