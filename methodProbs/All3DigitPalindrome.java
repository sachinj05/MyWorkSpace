package methodProbs;

public class All3DigitPalindrome {
	static boolean isPalindrome(int x) {
		int temp = x;
		int p = 0;

		do {
			int d = x % 10;
			p = p * 10 + d;
			x = x / 10;

		} while (x != 0);

		return p == temp;

	}

	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			boolean res = isPalindrome(i);

			if (res)
				System.out.println(i);
		}

	}

}
