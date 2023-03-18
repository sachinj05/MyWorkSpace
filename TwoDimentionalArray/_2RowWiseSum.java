package TwoDimentionalArray;

public class _2RowWiseSum {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] mat = mo.readMat();
		System.out.println("User Entered Matrix: ");
		mo.dispMat(mat);

		int[] res = rowWiseSum(mat);
		System.out.println("Row Wise Sum: ");
		for (int i = 0; i < res.length; i++) {
			System.out.println(i + 1 + " row sum is: " + res[i]);
		}
	}

	private static int[] rowWiseSum(int[][] mat) {
		int[] sum = new int[mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sum[i] += mat[i][j];
			}
		}

		return sum;
	}

}
