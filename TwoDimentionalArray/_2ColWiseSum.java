package TwoDimentionalArray;

public class _2ColWiseSum {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] mat = mo.readMat();
		System.out.println("User Entered Matrix: ");
		mo.dispMat(mat);

		int[] res = colWiseSum(mat);
		System.out.println("Column Wise Sum: ");
		for (int i = 0; i < res.length; i++) {
			System.out.println(i + 1 + " col sum is: " + res[i]);
		}
	}

	private static int[] colWiseSum(int[][] mat) {
		int[] sum = new int[mat[0].length];

		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				sum[i] += mat[j][i];
			}

		}

		return sum;
	}

}
