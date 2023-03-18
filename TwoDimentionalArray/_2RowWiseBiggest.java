package TwoDimentionalArray;

public class _2RowWiseBiggest {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] mat = mo.readMat();
		System.out.println("User Entered Matrix: ");
		mo.dispMat(mat);

		int[] res = rowWiseBiggest(mat);
		System.out.println("Row Wise Biggest: " );
		for (int i = 0; i < res.length; i++) {
			System.out.println(i+1+" row biggest is: "+res[i]);
		}
	}

	private static int[] rowWiseBiggest(int[][] mat) {
		int[] big = new int[mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] > big[i])
					big[i] = mat[i][j];
			}
		}

		return big;
	}
	

}
