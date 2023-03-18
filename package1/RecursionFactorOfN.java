package package1;

public class RecursionFactorOfN {
	public static void main(String[] args) {
		int n = 4;
		int x = display(n);
		System.out.println(x);
	}

	private static int display(int n) {
		if (n==1|n==0)
			return 1;
		return n*display(n-1);
	}

}








