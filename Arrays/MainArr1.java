package Arrays;

public class MainArr1 {
	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		int [] x = ao.readArray();
		System.out.println("User entered array: ");
		ao.dispArray(x);
		
		System.out.println("Total Prime number: "+ao.countPrimeNumber(x));
				
	}

}
