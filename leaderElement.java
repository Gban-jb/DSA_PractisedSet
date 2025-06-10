/*
🧠 Problem Statement:
Given an array of integers, find all leader elements in the array.
An element is considered a leader if it is greater than or equal to all elements to its right.
The rightmost element is always a leader.

✅ Example:
Input:
arr = {16, 17, 4, 3, 5, 2}

Output:
[17, 5, 2]

Explanation:

17 is greater than all elements to its right.

5 is greater than 2.

2 is the last element, so it is always a leader.

*/

package array2;
import java.util.ArrayList;
import java.util.List;

public class leaderElement {
	public static void main(String[] args) {
		int []arr = {1,400,50,2,30,14};
		
		List <Integer> leader = new ArrayList<>();
		int maxfromRight = arr[arr.length-1];
		leader.add(maxfromRight);
		
		for(int i = arr.length-2; i >=0; i--) {
			if(arr[i]>= maxfromRight) {
				maxfromRight = arr[i];
				leader.add(maxfromRight);
			}
		}
		
		reverse(leader, 0, leader.size()-1);
		System.out.println("Leaders elements are: "+ leader);
	}
	
	public static void reverse(List <Integer>leader, int start, int end) {
		while(start < end) {
			int temp = leader.get(start);
			leader.set(start, leader.get(end));
			leader.set(end, temp);
			start++;
			end--;
			
		}
	}
	
}
