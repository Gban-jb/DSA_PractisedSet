/*
✅ Problem: Sort Colors (Dutch National Flag Problem)
🧩 Problem Statement:
Given an array arr[] containing only the integers 0, 1, and 2, sort the array in-place so that all 0s come first, followed by all 1s, then all 2s.

You must solve the problem without using any library sort functions, and ideally in one pass (O(n)) time and constant space.

📥 Input:
An integer array arr[] of size n, where each element is either 0, 1, or 2.

📤 Output:
The sorted array (modify in-place).

🧪 Example 1:

Input: arr = [2, 0, 2, 1, 1, 0]  
Output: [0, 0, 1, 1, 2, 2]
🧪 Example 2:

Input: arr = [0, 1, 2, 0, 1, 2]  
Output: [0, 0, 1, 1, 2, 2]
✅ Constraints:
You must do it in O(n) time.

Only constant extra space allowed.

No built-in sorting methods.

*/





package array2;

public class DutchNationalFlagSort {

	public static void main(String[] args) {
		int [] arr = {2,1,0,2,1,0,0,2,1};
		
		int low = 0; 
		int mid = 0;
		int high = arr.length-1;
		
		while(mid <= high) {
			if(arr[mid] == 0) {
				//swap with arr[low];
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++; mid++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else if(arr[mid] == 2) {
				//swap with mid and last
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		for(int numb: arr) {
			System.out.println(numb);
		}
	}
}
