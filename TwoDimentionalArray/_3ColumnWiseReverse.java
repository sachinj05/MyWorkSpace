package TwoDimentionalArray;

public class _3ColumnWiseReverse {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] mat = mo.readMat();
		System.out.println("User Entered Matrix: ");
		mo.dispMat(mat);
		columnWiseRev(mat);
		System.out.println("After column wise reverse: ");
		mo.dispMat(mat);

	}

	private static void columnWiseRev(int[][] mat) {

		for (int i = 0; i < mat[0].length; i++) {
			int f = 0, l = mat.length - 1;

			while (f < l) {
				int temp = mat[l][i];
				mat[l][i] = mat[f][i];
				mat[f][i] = temp;
				f++;
				l--;

			}

		}

	}

}
