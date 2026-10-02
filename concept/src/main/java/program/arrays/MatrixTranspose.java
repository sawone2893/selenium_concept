package program.arrays;

import java.util.Arrays;

public class MatrixTranspose {
	/*
	 * Given an m×n 2D array, produce its transpose where result[j][i] =
	 * original[i][j].
	 * 
	 * EXAMPLE 1 2 3 
	 * 		   4 5 6 → 1 4 
	 * 				   2 5
	 * 				   3 6 
	 * CONSTRAINTS & NOTES Handle non-square
	 * matrices correctly — don't assume m == n.
	 */
	
	public static int[][] transposeMatrix(int matrix[][]){
		int row=matrix.length;
		int col=matrix[0].length;
		int tMatrix[][]=new int[col][row];
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				tMatrix[i][j]=matrix[j][i];
			}
		}
		return tMatrix;
		
	}

	public static void main(String[] args) {
		int matrix[][]= {{1,2,3},{4,5,6}};
		System.out.println("Transpose Matrix: ");
		int tMatrix[][]=MatrixTranspose.transposeMatrix(matrix);
		for (int[] row : tMatrix) {
            System.out.println(Arrays.toString(row));
        }
	}

}
