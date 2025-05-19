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

/*
function productExceptSelf(nums):
    n = length of nums
    create output array of size n and fill with 1s

    # Step 1: Build prefix product
    prefix = 1
    for i from 0 to n-1:
        output[i] = prefix
        prefix = prefix * nums[i]

    # Step 2: Multiply with postfix product
    postfix = 1
    for i from n-1 down to 0:
        output[i] = output[i] * postfix
        postfix = postfix * nums[i]

    return output
*/

package array2;

public class ProductThree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] prefixArr = new int[arr.length];
        int prefix = 1;

        // Step 1: Build prefix array
        for (int i = 0; i < arr.length; i++) {
            prefixArr[i] = prefix;
            prefix *= arr[i];
        }

        int[] postfixArr = new int[arr.length];
        int postfix = 1;

        // Step 2: Build postfix array
        for (int i = arr.length - 1; i >= 0; i--) {
            postfixArr[i] = postfix;
            postfix *= arr[i];
        }

        // Step 3: Multiply prefix and postfix to get the final result
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = prefixArr[i] * postfixArr[i];
        }

        // Step 4: Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
