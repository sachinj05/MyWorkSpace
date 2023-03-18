package PatternProbs;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int x = i;
			int k = n - 1;
			for (int j = 1; j <= i; j++) {

				System.out.print(x + " ");
				x = x + k;
				k--;

			}
			System.out.println();

		}
	}

}
