/* ✅ DSA Problem: Left Rotate the Array by One (Using Shifting)
🔹 Problem Statement:
You are given an integer array. Your task is to left rotate the array by one position. Do this manually by shifting elements — do not use built-in array rotation functions.

🔸 Input Example:

ini
Copy
Edit
arr = [10, 20, 30, 40, 50]
🔸 Output:

sql
Copy
Edit
After left rotation by one: [20, 30, 40, 50, 10]
🔹 Constraints:
Array size ≥ 1

Use only manual shifting

Do not use extra arrays or built-in rotation utilities


*/

package dsa;

import java.util.Arrays;

public class leftRotate {

	public static void main(String[] args) {

		int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int temp = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
	
		System.out.print(Arrays.toString(arr));
	}
}

