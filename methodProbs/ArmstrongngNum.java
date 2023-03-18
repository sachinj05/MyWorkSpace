package methodProbs;

import java.util.Scanner;

public class ArmstrongngNum {
	
		static boolean m2(int n) {
			int count = 0;
			int sum = 0;
			int temp1 = n;
			int temp2 = n;

			do {
				count++;
				n = n/10;
			}while (n!=0);
			
			
			do {
				int d = temp1%10;
				double power = Math.pow(d, count);
				sum+=power;
		        temp1 = temp1/10;
			}while (temp1!=0);
			

			return sum==temp2;
				
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			 int x = sc.nextInt();
			System.out.println(m2(x));

		}


}
