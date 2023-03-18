package TwoDimentionalArray;

public class _4MultiplicationMat {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();

		int[][] x = mo.readMat();
		int[][] y = mo.readMat();
		System.out.println("Entered 1st Matrix: ");
		mo.dispMat(x);
		System.out.println("Entered 2nd Matrix: ");
		mo.dispMat(y);

		int[][] res = multiply(x, y);
		System.out.println("Multiplied result Matrix: ");
		mo.dispMat(res);

	}

	private static int[][] multiply(int[][] x, int[][] y) {

		if (x.length != y[0].length || y.length != x[0].length)
			return null;

		int[][] rs = new int[x.length][y[0].length];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				for (int k = 0; k < y.length; k++) {
					rs[i][j] += x[i][k] * y[k][j];
				}
			}
		}

		return rs;

	}

}
