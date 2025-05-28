class ZeroEnd {
	public void moveZeroes(int[] nums) {
		int j = 0;

		for(int k = 0; k< nums.length; k++){
			if(nums[k]!= 0){
				nums[j] = nums[k];
				j++;
			}
		}

		for(int k = j; k < nums.length; k++){
			nums[k] = 0;
		}
	}
}