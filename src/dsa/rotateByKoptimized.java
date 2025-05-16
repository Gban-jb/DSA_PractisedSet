package dsa;

import java.util.Arrays;
public class rotateByKoptimized {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int k = 2;
		k = k % arr.length;

		// Step 1: Reverse all arrays: 
		reverse(arr, 0, arr.length-1);

		// Step 2: Reverse the first element to the k elements
		reverse(arr, 0, k-1);

		// Step 3: Reverse the k to n-k elements. Remaining elements
		reverse(arr, k, arr.length-1);
		System.out.print(Arrays.toString(arr));
	}

	public static void reverse(int []arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
