
public class isSingleElement {

	public static void main(String[] args) {
		int [] nums = {1,4,3,4,1};


		        for(int i = 0; i < nums.length; i++){
		        boolean isTwice = false;
		            for(int j = 0; j < nums.length; j++){

		                if( i != j && nums[i] == nums[j]){
		                    isTwice = true;
		                    break;
		                }
		            }

		            if(!isTwice){
		                System.out.print(nums[i]);
		            }
		        }
		        
		       // System.out.println("-1");
	}

}
