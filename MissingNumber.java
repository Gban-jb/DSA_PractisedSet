/* ✅ Question: Find the Missing Number (1 to N)
Problem Statement:
You are given an array nums containing n distinct numbers taken from the range 1 to n+1. This means exactly one number is missing from the full range 1 to n+1.

Write a function to find and return the missing number.

Example:
java
Copy
Edit
Input:  nums = [1, 2, 4, 5, 6]
Output: 3
*/





package array2;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4, 5, 6,8};  // Missing 4
        int n = arr.length +1;
        int sum = n*(n+1)/2;
        int sumElement = 0;
        for(int i = 1; i < arr.length + 1; i++) {
        	sumElement = sumElement + arr[i-1];
        }        
        int missingNumber = sum - sumElement;
        System.err.println(missingNumber);
    }
}
