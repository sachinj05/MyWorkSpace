package date2_12;
//Prime number
import java.util.Scanner;

public class PrimeNumber {
static boolean isPrime(int x) {
		
		for(int i=2; i<=x/2; i++) {
			if(x%i==0)
				return false;
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean rs = isPrime(n);
		if(rs)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");


	}

}
