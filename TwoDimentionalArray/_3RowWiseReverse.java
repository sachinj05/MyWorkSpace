package TwoDimentionalArray;

//Every row first element would be swap with the every row last element.
public class _3RowWiseReverse {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] mat = mo.readMat();
		System.out.println("User Entered Matrix: ");
		mo.dispMat(mat);
		rowWiseRev(mat);
		System.out.println("After row wise reverse: ");
		mo.dispMat(mat);

	}

	private static void rowWiseRev(int[][] mat) {
		
		for (int i = 0; i < mat.length; i++) {
			int f = 0, l = mat[i].length - 1;

			while (f < l) {
				int temp = mat[i][l];
				mat[i][l] = mat[i][f];
				mat[i][f] = temp;
				f++;
				l--;

			}

		}
	}

}
