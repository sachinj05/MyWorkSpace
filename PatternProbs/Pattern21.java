package PatternProbs;

public class Pattern21 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			
			int x = 0;

			for (int j = 1; j <= n - i; j++)
				System.out.print("  ");

			for (int j = 1; j <= 2 * i - 1; j++) {

				if (i% 2 == 1) 
					System.out.print(j%2 + " ");
				

				else 
					System.out.print(x%2 + " ");
				x++;
					
			}

			System.out.println();

		}
	}

}
