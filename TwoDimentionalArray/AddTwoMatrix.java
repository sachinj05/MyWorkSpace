package TwoDimentionalArray;

public class AddTwoMatrix {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();

		System.out.println("Read first matrix: ");
		int[][] x = mo.readMat();
		System.out.println("Read second matrix: ");
		int[][] y = mo.readMat();

		System.out.println("User entered first matrix: ");
		mo.dispMat(x);
		System.out.println("User entered second matrix: ");
		mo.dispMat(y);

		int[][] z = addMat(x, y);
		if (z == null) {
			System.out.println("Addition Faild");
		} else {
			System.out.println("Addition of both the matrix is: ");
			mo.dispMat(z);
		}

	}

	private static int[][] addMat(int[][] x, int[][] y) {

		if (x.length != y.length || x[0].length != y[0].length)
			return null;

		int[][] z = new int[x.length][x[0].length];

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}

		return z;
	}

}
