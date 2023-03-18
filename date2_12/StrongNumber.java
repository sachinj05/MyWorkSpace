package date2_12;
//Return True if N is strong number else return false.
import java.util.Scanner;

public class StrongNumber {
	static boolean factor(int x) {
		int num=x;
		int sum =0;
		for(int i = 1; i<=x/2; i++) {
			if(x%i==0) {
				int fact = i;
				while(i!=1) {
					i--;
					fact *= i;
				}
				sum+=fact;
			}
				
		}
		return num == sum;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(factor(n));

		
	}
}
