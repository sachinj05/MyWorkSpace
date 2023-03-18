package Roughs;

import java.util.Scanner;

public class Stringword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int f = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[0] != ' ' || ch[i] != ' ' && ch[i-1] == ' ') {
				f=i;

			}
			if (ch[ch.length - 1] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				char temp = ch[i];
				ch[i]= ch[f];
				ch[f] = temp;

			}

		}
		System.out.println(new String(ch));

	}

}
