package methodProbs;

import java.util.Scanner;

public class PalindromeNumber {
	
	static boolean isPalindrome(int x) {
		int temp = x;
		int p=0;
		
		do {
			int d = x%10;
			
			p=p*10+d;
			x=x/10;
			
		}while(x!=0);
		
		return p==temp;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPalindrome(n));

	}

}
