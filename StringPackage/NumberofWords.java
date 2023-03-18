package StringPackage;

public class NumberofWords {
	public static void main(String[] args) {
		StringOperation sp = new StringOperation();

		String str = sp.strInput();
		System.out.println("Number of words present = "+sp.countWords(str));
	
	}

}
