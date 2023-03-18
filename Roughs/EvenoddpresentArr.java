package Roughs;

import java.util.Scanner;

public class EvenoddpresentArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] res=present(arr);
		System.out.println("Even: "+res[0]);
		System.out.println("Odd: "+res[1]);
		
	}

	private static int[] present(int[] arr) {
		int ed=0,od=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0)
				ed++;
			else
				od++;
		}
		int []res= {ed,od};

		return res;
	}

}
