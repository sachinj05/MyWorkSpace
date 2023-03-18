package Roughs;

public class E1 {
	public static void main(String[] args) {
		try {
			int[] atr = new int[10];
			atr[10] = 30/0;
		} 
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e.getMessage());

		}
		
		
	}

}
