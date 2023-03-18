package Roughs;

import java.util.Scanner;

public class DuckNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter a number:");
 	String s = sc.next();
 	String str = isDuck(s);
 	System.out.println(str);
 	
}

private static String isDuck(String str) {
	char[] ch = str.toCharArray();
	
	if (ch[0]=='0') {
		return "Not Duck";
	}
	
	int count=0;
	for (int i = 0; i < ch.length; i++) {
		if (ch[i]=='0') {
			return "is Duck";
		}
	}
	return "Not Duck";
	
}
}
