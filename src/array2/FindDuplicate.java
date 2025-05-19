/* ✅ Question: Find the Duplicate Number (No Extra Space)
Problem Statement:
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] (inclusive), return the duplicate number.

There is only one repeated number, but it could be repeated more than once.

You must not modify the array.

You must use only constant (O(1)) extra space.

Your algorithm must run in less than O(n²) time.

Example:
java
Copy
Edit
Input:  nums = [3, 1, 3, 4, 2]
Output: 3
java
Copy
Edit
Input:  nums = [1, 3, 4, 2, 2]
Output: 2
*/



package array2;
public class FindDuplicate {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,2, 4};
		

		for(int i= 0; i < arr.length; i++) {
			int num = arr[i];
			
			boolean isFound = false;
			
			for(int k = 0; k < i; k++) {
				if(arr[i] == arr[k]) {
					isFound = true;
				}
			}
	if(!isFound) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					
					System.out.println(arr[i]);
					break;
				}
			}				
			}	
		}	
	}
}
