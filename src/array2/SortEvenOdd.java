/* 
 ✅ Problem: Sort Array by Parity (Even-Odd Grouping)
🧩 Problem Statement:
You are given an integer array arr[] of size n. Your task is to rearrange the array so that all even numbers come before all odd numbers.
The order of even or odd numbers does not matter.
You must modify the array in-place (no new array).
Try to do it using the two-pointer technique.

📥 Input:
An array arr[] of integers.
You can assume:
1 <= arr.length <= 10^5
0 <= arr[i] <= 10^4

📤 Output:
Rearranged arr[] where:
All even numbers appear before all odd numbers.

🧪 Examples:
Example 1:

Input:  arr = [3, 1, 2, 4]
Output: [2, 4, 3, 1]   // or [4, 2, 1, 3] — even numbers first, order doesn't matter

Example 2:
Input:  arr = [0, 1]
Output: [0, 1]    // already sorted by parity
 */


package array2;
public class SortEvenOdd {
	public static void main(String[] args) {
		int [] arr = {3,1,2,4,3};
		int left = 0;
		int right = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {
				for(int j = i+1; j < arr.length; j++) {
					if(arr[j] %2==0) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
