package StringPackage;

public class SumOfDigitInStr {
	public static void main(String[] args) {
		StringOperation sp = new StringOperation();
		
		String str = sp.strInput();	
		System.out.println("Sum of Digits in String = "+sp.sumDigitStr(str));
		
	}

}
