package TwoDimentionalArray;

public class CountPrimeinMatrix {
	public static void main(String[] args) {
		MatrixOperation mo = new MatrixOperation();
		int[][] x = mo.readMat();
		System.out.println("User entered matrix: ");
		mo.dispMat(x);
		int prime = countPrimeMat(x);
		System.out.println("Total Prime Number present = "+prime);
	}

	private static int countPrimeMat(int[][] mat) {
		int count = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				boolean rs = isPrime(mat[i][j]);
				if (rs)
					count++;
			}
		}

		return count;
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i <= n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}

		return true;
	}

}
