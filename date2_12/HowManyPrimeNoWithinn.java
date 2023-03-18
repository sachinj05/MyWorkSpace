package date2_12;
//How Many Prime No Within 'N'
import java.util.Scanner;

public class HowManyPrimeNoWithinn {
		
		static boolean isPrime(int x) {
			
			for(int i=2; i<=x/2; i++) {
				if(x%i==0)
					return false;
				System.out.println(x);
			}
			return true;
			
		}
		

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int count = 0;
			for(int i=2; i<=n; i++) {
				boolean rs = isPrime(i);
				if(rs)
					count++;	
			}
			System.out.println(count);	
		}
}
