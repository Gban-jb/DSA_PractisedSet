
public class maxConsecutiveNumber {

	public static void main(String[] args) {
		int [] nums = {1,1,0,0,1,1,1,0,0,0};
		        int maxCount = 0; 
		        int currentCount = 0;

		        for(int num : nums){
		            if(num == 1){
		                currentCount++;
		            }
		            else{
		                currentCount = 0;
		            }
		            maxCount = (maxCount > currentCount)? maxCount: currentCount;
		        }
		        System.out.println(maxCount); 
		    }   
	}
