/* 
Problem: Check if Any Triplet Sums to a Given Value
(Also known as the classic 3Sum problem)

🧩 Problem Statement:
Given an array of integers arr[] and an integer target, determine whether there exists any triplet (i, j, k) such that:

arr[i] + arr[j] + arr[k] == target

i < j < k

Return true if such a triplet exists, otherwise return false.

📥 Input:
An integer array arr[] of size n (n ≥ 3)

An integer target — the value you want the triplet to sum up to

📤 Output:
A boolean: true if a valid triplet exists, false otherwise

🧪 Example 1:
Input:  arr = [12, 3, 4, 1, 6, 9], target = 24  
Output: true  
Explanation: The triplet (12, 3, 9) sums to 24.
🧪 Example 2:
Input:  arr = [1, 2, 3, 4, 5], target = 50  
Output: false  
Explanation: No such triplet exists.
 */



package array2;
import java.util.Arrays;
public class ThreeSum {
	public static void main(String[] args) {
		int []arr = {12,3,4,1,6,9};
		int target = 24;
		boolean isFound = false;
		
		for(int i = 0; i< arr.length; i++) {
			int num = arr[i];
			for(int j = 0; j< arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int i = 0; i < arr.length; i++) {
			int left = i + 1;
			int right = arr.length-1;

			while(left < right) {
				if(arr[i] + arr[left] + arr[right] == target) {
					isFound = true;
					System.out.printf(" Target found and the elements are %d, %d, %d", arr[i], arr[left], arr[right]);
					break;
				}
				else if( arr[i] + arr[left] + arr[right] > target) {
					right--;
				}
				else if( arr[i] + arr[left] + arr[right] < target) {
					left++;
				}
			}
		}
	}
}
