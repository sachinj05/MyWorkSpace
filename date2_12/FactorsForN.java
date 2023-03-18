package date2_12;
//How many factors for 'N'
import java.util.Scanner;

public class FactorsForN {
	static int factor(int x) {
		int count=0;
		for(int i = 1; i<=x/2; i++) {
			if(x%i==0)
				count++;
		}
		return count;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(factor(n));
		
	}

}
