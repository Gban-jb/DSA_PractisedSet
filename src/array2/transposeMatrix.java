/*
❓ Problem 22: Transpose of a Matrix
Given a 2D matrix matrix[][], your task is to transpose the matrix.
In the transpose of a matrix, the rows become columns and the columns become rows.

In other words, swap all elements matrix[i][j] with matrix[j][i].
🔁 Input:
An M x N matrix of integers.

✅ Output:
The transposed matrix of size N x M.
📌 Example:
Input:
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
Output:
[
  [1, 4],
  [2, 5],
  [3, 6]
]              */

package array2;

import java.util.List;

public class transposeMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		int [][] result = new int [cols][rows];
			
		for(int i = 0; i <= matrix.length-1; i ++) {
			for(int j = 0; j <= matrix[i].length-1; j++) {
				result[j][i] = matrix[i][j];
			}
		}
		
		for(int i = 0; i <= result.length-1; i++) {
			for(int j = 0; j <= result[i].length-1; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
