import java.util.Arrays;

public class longestConsecutive {
    public int longestConsecutivee(int[] nums) {
        //1. Sort the array
        //2. find the minimum like if the previous minimum is there in the array, then it is the required number so increase the count and move the x to the next element.
        //3. If the number is the same, then do nothing just pass into next number in the array
        //4. If the number is not in the sequence then make that number the upcoming smallest number. and start searching in the array. 
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int count = 0;
        int curCount = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) continue;
            else if(nums[i] -1 == nums[i -1]){
                curCount += 1;
            }
            else{  // Not equal or not in the array
                count = Math.max(curCount, count);
                curCount = 1;  //Reset the curcount
            }
        }

    return Math.max(curCount, count);
    }
}


/* Brutle Force Way: 

class Solution {
public int longestConsecutive(int[] nums) {

    if(nums.length == 0) return 0;

    int longest = 1;

    for(int i = 0; i < nums.length; i++){
        int x = nums[i];
        int count = 1;

        while( linearSearch(nums, x+1) == true){
            x = x+1;
            count += 1;
        }

        longest = Math.max(longest, count);

    }
    return longest;
}

public static boolean linearSearch(int [] arr, int x){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == x){
            return true;
        }
    }
    return false;
}
}
*/