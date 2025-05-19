/* Problem Statement:
Given an array of integers arr[] and an integer value K, your task is to count the number of unique pairs (i, j) such that:
arr[i] + arr[j] == K
and
i < j

You must solve this in O(n) time complexity using a hashing approach.
📥 Input:
An integer array arr[] of size n

An integer K representing the target sum
📤 Output:
An integer representing the number of pairs that sum to K

🧪 Example 1:
Input: arr = [1, 5, 7, -1, 5], K = 6  
Output: 3

Explanation:
The pairs are (1, 5), (7, -1), and (1st 5, 2nd 1)
🧪 Example 2:

Input: arr = [1, 1, 1, 1], K = 2  
Output: 6

Explanation:
All (i, j) pairs where i < j will have sum 2.
*/

package array2;
public class SumPairs {

	public static void main(String[] args) {
		int [] arr = {1,1,1,1}; int sum = 2;
		
		int count = 0;
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
