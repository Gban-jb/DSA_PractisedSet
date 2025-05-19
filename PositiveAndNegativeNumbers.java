/*
✅ Problem: Rearrange Positives and Negatives Alternately
🧩 Problem Statement:
Given an array arr[] containing both positive and negative integers, rearrange the elements so that positive and negative numbers appear alternately. If there are extra positive or negative numbers, place them at the end of the array.

You must solve this using index manipulation, not extra space like a separate array.

📥 Input:
An integer array arr[] of size n, with both positive and negative numbers (not necessarily in order).

You can assume n >= 1.

📤 Output:
Modify the array in-place so that:

Positive and negative numbers alternate (starting with a positive if possible).

Remaining positives or negatives are placed at the end in original order.

🧪 Example 1:

Input:  arr = [1, 2, 3, -4, -1, 4]
Output: [1, -4, 2, -1, 3, 4]

Explanation:
Positives and negatives alternate. Remaining positives are appended.
🧪 Example 2:

Input:  arr = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
Output: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
Explanation:
Starts with a positive. Extra positives are placed at the end.
 */

package array2;
public class PositiveAndNegativeNumbers {
	public static void main(String[] args) {
		int [] arr = {-1,-2,-3,4,3};

		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0 && arr[i] < 0) {
				for(int j = i; j < arr.length; j++) {
					if(arr[j] > 0) {
						//swap
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}
			else if(i % 2 != 0 && arr[i] > 0 ) {
				for(int j = i; j < arr.length; j++) {
					if(arr[j] < 0) {
						//Swap
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}
		}
		for(int numb : arr) {
			System.out.println(Integer.toString(numb));
		}
	}
}
