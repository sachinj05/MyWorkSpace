package package1;

public class Pattern2 {
	public static void main(String[] args) {
		int n = 5,k = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char) (k + 65) + "  ");
				k++;
			}
			System.out.println();
		}
	}
}