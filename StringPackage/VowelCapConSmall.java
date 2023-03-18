package StringPackage;

public class VowelCapConSmall {
	public static void main(String[] args) {
		StringOperation so = new StringOperation();
		String x = so.strInput();
		System.out.println("New String: "+so.vowelCapConSmall(x));
	}

}
