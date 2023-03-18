package StringPackage;

import java.util.Scanner;

public class SwapWordsFastAndLastCharStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		char[] ch = s.toCharArray();

		int f = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ' && i == 0 || ch[i] != ' ' && ch[i - 1] == ' ')
				f = i;

			else if (ch[i] != ' ' && i == ch.length - 1 || ch[i] != ' ' && ch[i + 1] == ' ') {

				char c = ch[i];
				ch[i] = ch[f];
				ch[f] = c;

			}

		}
		String str = new String(ch);
		System.out.println(str);

	}

}
