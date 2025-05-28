class Solution {
    public int secondLargestElement(int[] nums) {
    	// nums = {6,5,4,3,3,7,8};
    	int max = nums[0];
    	int count = 1;
    	
    	for(int i = 1; i < nums.length; i++) {
    		if(max < nums[i]) {
    			int temp = max;
    			max = nums[i];
    		}
    		
    		else if(max == nums[i]) {
    			count++;
    			if(count == nums.length) {
    				return -1;
    			}
    		}
    	}
    	
    	Integer secondMax = null;
    	
    	for(int j = 0; j < nums.length; j++) {
    		if(nums[j] != max) 
    			if(secondMax == null || secondMax < nums[j]) {
    			secondMax = nums[j];
    		}
    	}
    	return secondMax;
    
    }
}