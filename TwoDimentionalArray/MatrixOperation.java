package TwoDimentionalArray;

import java.util.Scanner;

public class MatrixOperation {
	int[][] readMat(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the matrix: ");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Enter " + row * col + " elements: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
		
	}
	
	
	void dispMat(int[][] mat) {
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
