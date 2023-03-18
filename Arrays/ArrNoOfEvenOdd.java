package Arrays;

import java.util.Scanner;

public class ArrNoOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+ size + " values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int [] eo = countEO(arr);
		System.out.println("Number of Even: "+ eo[0]);
		System.out.println("Number of Odd: "+ eo[1]);

	}
	
	
	static int [] countEO(int[] x) {
		int ev=0, od=0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0)
				ev++;
			else
				od++;
			
		}
		int[] res = {ev,od};
		
		return 	res;
	
		
	}
	
}
