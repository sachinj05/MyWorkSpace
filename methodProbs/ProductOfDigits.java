package methodProbs;

import java.util.Scanner;

public class ProductOfDigits {
	
	static int product(int m, int n) {
		int res = m * n;
		return res;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 
		 int ans = product(x,y);

		System.out.println(ans);

	}

}
