package StringPackage;

import java.util.Scanner;

public class StringOperation {

	String strInput() {
		System.out.println("Enter Sentence: ");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		return str;

	}

	int countWords(String str) {
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ' && i==0 ||ch[i] != ' ' && ch[i - 1] == ' ')
				count++;

		}
		return count;

	}

	int countSpecialChar(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' || ch <= '9') == false)

				count++;

		}
		return count;

	}

	int sumDigitStr(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {

				sum += ch - 48;
			}
		}
		return sum;
	}

	String firstSmall(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[0] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {

				if (ch[i] >= 'A' && ch[i] <= 'Z')
					ch[i] = (char) (ch[i] + 32);

			} else if (ch[i] >= 'a' && ch[i] <= 'z')
				ch[i] = (char) (ch[i] - 32);
		}

		return new String(ch);
	}
	
	String vowelCapConSmall(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z') {

				if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
					ch[i] = (char) (ch[i]-32);
					
				else if(ch[i] >= 'A' && ch[i] <= 'Z' && (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')==true)
					ch[i] = (char) (ch[i]+ 32);

			}
		}

		return new String(ch);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
