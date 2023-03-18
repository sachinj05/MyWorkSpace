package TwoDimentionalArray;

public class _2ColWiseBiggest {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] mat = mo.readMat();
		System.out.println("User Entered Matrix: ");
		mo.dispMat(mat);

		int[] res = colWiseBiggest(mat);
		System.out.println("Col Wise Biggest: " );
		for (int i = 0; i < res.length; i++) {
			System.out.println(i+1+" col biggest is: "+res[i]);
		}
	}

	private static int[] colWiseBiggest(int[][] mat) {
		int[] big = new int[mat[0].length];

		for (int i = 0; i < mat[0].length; i++) {
			big[i] = mat[0][i];
			for (int j = 1; j < mat.length; j++) {
				if(mat[j][i] > big[i])
					big[i] = mat[j][i];
			}
		}

		return big;
	}

}
