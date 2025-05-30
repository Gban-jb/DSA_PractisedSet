public class LongestArray {
    public int longestSubarray(int[] nums, int k) {
        int maxLength = 0;
        // [10,5,2,7,1,9] : k = 15; 

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
            sum = sum + nums[j];
            if (sum == k) {
                maxLength = (maxLength> j-i+1)? maxLength: j-i+1;
            }
            else if (sum > k) {
                break;
            }

            }
        }
        return maxLength;
    }
}
