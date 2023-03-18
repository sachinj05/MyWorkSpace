package methodProbs;

import java.util.Scanner;

public class EvenOddGoodBad {
	
	static String m1(int n) {
		int seven = 0;
		int sodd = 0;
		
		do{
			int d = n%10;
		if (d%2==0)
			seven+=d;
		else
			sodd+=d;
		n = n/10;
		}while(n!=0);
		if(seven == sodd)
			return "good";
		else 
			return "bad";
				
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a big digit: ");
		 int x = sc.nextInt();

		 String ans = m1(x);

		System.out.println(ans);

	}

}
