package package1;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 5,k = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i%2!=0&&j%2==0) {
					System.out.print(0+" ");
				}else {
					System.out.print(1+" ");

				}
			}
			System.out.println();
		}
	}
}