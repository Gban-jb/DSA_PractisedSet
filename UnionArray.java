public class UnionArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int [] merged = new int[nums1.length + nums2.length];

        int i = 0,j=0,k=0;
        while(i<nums1.length && j <nums2.length){
            if(nums1[i]< nums2[j]){
                merged[k++] = nums1[i++];
            }
            else if(nums1[i]>nums2[j]){
                merged[k++] = nums2[j++];
            }

            else if(nums1[i] == nums2[j]){
                merged[k++] = nums1[i];
                i++;
                j++;
            }
        }
            while(i < nums1.length){
                merged[k++] = nums1[i++];
            }

             while(j < nums2.length){
                merged[k++] = nums2[j++];
            }

            int n = 0;
            int [] array = new int[k];
            for(int m = 0; m < k; m++){
                if(m== 0 || merged[m] != merged[m-1]){
                    array[n++] = merged[m];
                }
            }

            int [] result = new int[n];
            for(int o = 0; o < n; o++){
                result[o] = array[o];
            }
        
        return result;
    }
    }