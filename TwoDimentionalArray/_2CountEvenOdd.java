package TwoDimentionalArray;

public class _2CountEvenOdd {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] mat = mo.readMat();
		System.out.println("User Entered Matrix: ");
		mo.dispMat(mat);

		int[] ct = countEoMat(mat);
		System.out.println("Number of even: " + ct[0]);
		System.out.println("Number of odd: " + ct[1]);

	}

	private static int[] countEoMat(int[][] mat) {
		int ev = 0, od = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] % 2 == 0)
					ev++;
				else
					od++;
				
			}
		}
		
		int[] count = {ev,od};
		return count;
		
	}

}
