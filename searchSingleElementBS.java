
public class searchSingleElementBS {
	public int singleNonDuplicate(int[] nums) {
		int low = 0;
		int high = nums.length-1;

		while(low < high){
			int mid = low + (high-low)/2;
			//Boundary Check

			boolean leftEqual = (mid > 0) && (nums[mid] == nums[mid-1]);
			boolean rightEqual = (mid < nums.length-1) && (nums[mid] == nums[mid+1]);


			if(mid % 2 ==0){  //even 
				if(!leftEqual && !rightEqual){
					return nums[mid];
				}


				else if (leftEqual){
					high = mid-2;
				}
				else {
					low=mid+2;
				}
			}



			else if(mid%2!=0){ //odd
				if(!leftEqual && !rightEqual){
					return nums[mid];
				}
				else if (leftEqual){ 
					low = mid+1;
				}
				else{
					high=mid-1;
				}
			}
		}
		return nums[low];  
	}
}
