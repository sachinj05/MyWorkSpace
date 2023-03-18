package Roughs;

import java.util.Scanner;

public class SwapFLchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String s = swap(str);
		System.out.println("New string = "+s);
	}
	
	private static String swap(String str) {
		char[] ch = str.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[0]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
				f=i;
			}
			
			else if (ch[ch.length-1]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
				char t = ch[i];
				ch[i]=ch[f];
				ch[f]=t;
			}
			
		}
		
		return new String(ch);
	}

}
