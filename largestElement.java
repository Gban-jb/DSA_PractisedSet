class Solution {
    public int largestElement(int[] nums) {
    	int max = nums[0];
    	for(int i = 1; i < nums.length; i++) {
    		if(max<nums[i]) {
    			int temp = max;
    			max = nums[i];
    			nums[i] = temp;
    		}
    		
    	}
    	return max;
    
    }
}