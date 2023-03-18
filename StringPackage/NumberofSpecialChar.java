package StringPackage;

public class NumberofSpecialChar {
	public static void main(String[] args) {
		StringOperation sp = new StringOperation();

		String str = sp.strInput();
		System.out.println("Number of Special character present = "+sp.countSpecialChar(str));
	}

}
