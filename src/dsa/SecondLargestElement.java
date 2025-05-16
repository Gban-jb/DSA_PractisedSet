/* DSA Problem: Find the Second Largest Element (with Edge Case Handling)
🔹 Problem Statement:
You are given an integer array. Your task is to find the second largest unique element in the array.

🔸 Input Example:
arr = [12, 35, 1, 10, 34, 1]
🔸 Output:
Second largest element is: 34
🔸 Edge Cases to Handle:
All elements are the same:
arr = [5, 5, 5, 5]
→ Output: "No second largest element"

Only one element in the array:
arr = [10]
→ Output: "No second largest element"
Negative numbers and duplicates:
arr = [-5, -2, -3, -2]
→ Output: -3
 */


package dsa;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] arr = {1, 100, 100, 1000};

		if (arr.length <= 1) {
			System.out.println("No second largest element");
			return;
		}

		// Step 1: Find max
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// Step 2: Check if all elements are same
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				count++;
			}
		}
		if (count == arr.length) {
			System.out.println("All elements are same, no second largest element");
			return;
		}

		// Step 3: Find second max
		Integer secondMax = null;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != max) {
				if (secondMax == null || arr[i] > secondMax) {
					secondMax = arr[i];
				}
			}
		}
		System.out.println("Second largest element is: " + secondMax);
	}
}
