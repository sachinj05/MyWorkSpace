package TwoDimentionalArray;

public class _4SpiralOrderPrintEle {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();

		int[][] x = mo.readMat();
		System.out.println("Entered Matrix: ");
		mo.dispMat(x);

		System.out.println("Elements of the Matrix are: ");
		printSpiral(x);

	}

	private static void printSpiral(int[][] x) {
		int n = x.length;
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			
			for (int k = i; k < j; k++)
				System.out.print(x[i][k] + " ");
			
			for (int k = i; k < j; k++)
				System.out.print(x[k][j] + " ");
			
			for (int k = j; k > i; k--)
				System.out.print(x[j][k] + " ");
			
			for (int k = j; k > i; k--)
				System.out.print(x[k][i] + " ");

		}
		
		if(n%2 == 1)
			System.out.println(x[n/2][n/2]);

	}

}
