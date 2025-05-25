package array2;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		int [][] matrix = 
			{   {1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};

		if(matrix.length == 0){
			System.out.println("Input error");
			return;
		}

		int left = 0;
		int top = 0;
		int right = matrix[0].length-1;
		int bottom = matrix.length-1;

		List <Integer> Smatrix = new ArrayList<>();

		while(top <= bottom && left <= right) {
			for(int i = left; i <=right; i++) {
				Smatrix.add(matrix[top][i]);
			}
			top++;

			for(int i = top; i <= bottom; i++) {
				Smatrix.add(matrix[i][right]);
			}
			right--;

			if(left<= right) {
				for(int i = right; i >= left; i--) {
					Smatrix.add(matrix[bottom][i]);
				}
				bottom--;
			}

			if(bottom >= top) {
				for(int i = bottom; i >= top; i--) {
					Smatrix.add(matrix[i][left]);
				}
				left++;
			}
		}
		System.out.print("The Spiral Matrix is : ");	
		for(int num: Smatrix) {
			System.out.print(num + " ");
		}
	}
}
