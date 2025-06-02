public class reArrange {
	    public int[] rearrangeArray(int[] nums) {
	        int [] result = new int [nums.length];
	        int posIndex = 0;
	        int negIndex = 1;

	        for(int num : nums){
	            if(num > 0){
	                result[posIndex] = num;
	                posIndex = posIndex + 2;
	            }
	            else{
	                result[negIndex] = num;
	                negIndex = negIndex + 2;
	            }
	        }
	        return result; 
	    }
	}