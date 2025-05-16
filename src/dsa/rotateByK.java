/*
✅ DSA Problem: Rotate Array by K Places (Naive & Optimized using Modulo Trick)
🔹 Problem Statement:
You are given an integer array and a number k. Your task is to rotate the array to the right by k places.
Implement both:
A naive approach using repeated shifting.
An optimized approach using modulo arithmetic and reversal.
🔸 Input Example:
arr = [10, 20, 30, 40, 50]  
k = 2
🔸 Output:
After rotating by 2 positions: [40, 50, 10, 20, 30]
*/

package dsa;

import java.util.Arrays;

public class rotateByK {
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		int k = 2;
		k = k % arr.length;
		for(int j = 0; j < k; j++) {
			int temp = arr[arr.length-1];
			for(int i = arr.length-2; i >=0; i--) {
				arr[i+1] = arr[i];
			}
			arr[0] = temp;
		}
		
			System.out.print(Arrays.toString(arr));
	}
}