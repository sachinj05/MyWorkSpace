package Roughs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0;
		str=str.trim();
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==' '&&str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count+1);

	}
}
