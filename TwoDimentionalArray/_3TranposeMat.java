package TwoDimentionalArray;

public class _3TranposeMat {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] mat = mo.readMat();
		System.out.println("User Entered Matrix: ");
		mo.dispMat(mat);
		int[][] x = tranpose(mat);
		System.out.println("After transpose: ");
		mo.dispMat(x);

	}

	private static int[][] tranpose(int[][] mat) {
		int tr[][] = new int[mat[0].length][mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				tr[j][i] = mat[i][j];
			}
		}

		return tr;

	}

}
