package TwoDimentionalArray;

public class BigestofMatrix {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] x = mo.readMat();
		System.out.println("User entered matrix: ");
		mo.dispMat(x);
		int big = bigestMat(x);
		int small = smallestMat(x);
		System.out.println("The Bigest= "+big);
		System.out.println("The Smallest= "+small);

	}

	private static int smallestMat(int[][] mat) {
		int small = mat[0][0];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < small) {
					small = mat[i][j];
				}
			}
		}

		return small;
	}

	private static int bigestMat(int[][] mat) {
		int big = mat[0][0];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > big) {
					big = mat[i][j];
				}
			}
		}

		return big;
	}

}
