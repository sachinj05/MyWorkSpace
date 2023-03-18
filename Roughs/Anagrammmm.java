package Roughs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrammmm{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter another string: ");
		String str2 = sc.nextLine();
		
		str1=str1.replaceAll(" ", "");
		str2=str2.replaceAll(" ", "");
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}
		else
			System.out.println("Not an Anagram");

		

	}


}

