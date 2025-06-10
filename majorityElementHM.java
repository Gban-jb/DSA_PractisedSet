package array2;

import java.util.HashMap;

public class majorityElementHM {

	public static void main(String[] args) {
		
		int [] nums = {3,1,2,5,1,3,1,5,1};
		 //1. Create a HashMap to store it
		//2. If exist then update the frequency, if not then create a new element
		//3. if frequency is greater than N/3, then print it. 
		
		HashMap <Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
			else {
				map.put(nums[i], 1);
			}
		}
		
		
		map.forEach((key, value) -> {
			if(value > nums.length/3) {
				System.out.print( value + " ");
			}	
		});
	}
}
