/*
Problem 23: Rotate a Matrix by 90 Degrees (Clockwise)
You are given an N x N square 2D matrix representing an image.
Rotate the matrix by 90 degrees clockwise, in-place (meaning: do not use extra space for another matrix).
🔁 Input:
A square matrix matrix[][] of size N x N.
✅ Output:
The same matrix, rotated 90 degrees clockwise.
📌 Example:
Input:
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Output:
[
  [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3]
]
*/


package array2;
public class RotateMatrix {
	public static void main(String[] args) {
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9},
			    {3,4,5},
			    {5,6,7}
			};
		 
		int row = matrix.length;
		int cols = matrix[0].length;
		
		int [][] result = new int [cols][row];
		for(int i = 0; i <= matrix.length-1; i++) {
			for(int j = 0; j<= matrix[i].length-1; j++) {
				result[j][i] = matrix[i][j];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			
			int left = 0;
			int right = result[i].length-1;
			
			for(int j = 0; j < result[i].length; j++) {
				
			while(left < right) {
				int temp = result[i][left];
				result [i][left] = result[i][right];
				result[i][right] = temp;
				left++;
				right--;
			}
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
