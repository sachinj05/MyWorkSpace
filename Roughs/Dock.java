package Roughs;

import java.util.Scanner;

public class Dock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		String s = sc.next();
		System.out.println(isDuck(s));
	}

	private static boolean isDuck(String s) {
		char[] ch = s.toCharArray();
		boolean flag = false ;
		if(ch[0] == '0')
			return false;
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='0')
				flag = true;
		}
		return flag;
		
	}

}
