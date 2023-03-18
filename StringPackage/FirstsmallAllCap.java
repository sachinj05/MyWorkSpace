package StringPackage;

public class FirstsmallAllCap {
	public static void main(String[] args) {
		StringOperation sp = new StringOperation();

		String str = sp.strInput();
		System.out.println("New String is => "+sp.firstSmall(str));
	}

}
