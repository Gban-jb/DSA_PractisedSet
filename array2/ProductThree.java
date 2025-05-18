/*

✅ Question: Product of Array Except Self (No Division)
Problem Statement:
Given an integer array nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

You must not use division, and your algorithm should run in O(n) time with O(1) extra space (excluding the output array).

Example:
java
Copy
Edit
Input:  nums = [1, 2, 3, 4]
Output: [24, 12, 8, 6]
Explanation:

output[0] = 2 × 3 × 4 = 24

output[1] = 1 × 3 × 4 = 12

output[2] = 1 × 2 × 4 = 8

output[3] = 1 × 2 × 3 = 6

*/





package array2;

public class ProductThree {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		
		for(int i = 0; i <arr.length; i++) {
			
			int prefix = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					prefix = arr[i] *1;
					break;
				}
				else if(arr[j] > arr[i]) {
					prefix = prefix * arr[j];
				}
			}
			System.out.println(prefix);
				
			}
		
		}
}
