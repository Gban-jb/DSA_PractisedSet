/* 
	You are given a 2D matrix of size m x n where:
	
	Each row is sorted in ascending order from left to right, and
	
	Each column is sorted in ascending order from top to bottom.
	
	Your task is to find a given target number in the matrix and return true if it exists, otherwise return false.
	
	🔁 Input:
	A matrix matrix[][] of size m x n
	
	An integer target to search for
	
	✅ Output:
	true if target is found in the matrix
	
	false otherwise
	
	📌 Example:
	Input:
	
	int[][] matrix = {
	  {1, 4, 7, 11},
	  {2, 5, 8, 12},
	  {3, 6, 9, 16},
	  {10, 13, 14, 17}
	};
	int target = 5;
	Output:
	true
	Input:
	int target = 20;
	Output:
	false
 */


package array2;
public class searchElement {
	public static void main(String[] args) {

		int[][] matrix = {
				  {1, 4, 7, 11},
				  {2, 5, 8, 12},
				  {3, 6, 9, 16},
				  {10, 13, 14, 17}
				};
		int target = 16;
		boolean isFound = false;
		
		int row = 0;
		int col = matrix[0].length-1;
		
		while(row < matrix.length && col>=0) {
			if(matrix[row][col] == target) {
				isFound = true;
				break;
			}
			
			else if (matrix[row][col] > target) {
					col--;
			}
			else {
				row++;
			}
		}
			System.out.println(isFound);
	}
}
