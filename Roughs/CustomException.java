package Roughs;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Age: ");
		try {
			
			verifyAge(sc.nextInt());
		}
		catch(TooEarlyException e) {
			System.out.println(e.getMessage());
		}
		catch (TooLateException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void verifyAge(int age) {
		
		if(age>40)
			throw new TooLateException();
		else if (age<18)
			throw new TooEarlyException();
		else
			System.out.println("You are Wellcome");
		
	} 

}
