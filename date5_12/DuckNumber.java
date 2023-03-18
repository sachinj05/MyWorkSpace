package date5_12;

import java.util.Scanner;

public class DuckNumber {

	static String isDuck(String str) {
		
		char [] ch = str.toCharArray();
		
		if(ch[0]=='0')
			return "is not a Duck";
		int count = 0;
		
		for(int i=1; i<ch.length; i++) {
			
			if(ch[i] == '0')
				count++;
		}
		
		if(count>0)
			return "is a Duck";
		else
			return "is not a Duck";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isDuck(s));
	}

}
