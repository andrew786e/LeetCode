public class maximumSubArr {
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxVal = nums[0] ;
            int maxSoFar = nums[0] ; 
            for(int i = 1 ; i < nums.length ; i ++){
                maxVal = Math.max(nums[i] , nums[i] + maxVal) ;
                maxSoFar = Math.max(maxSoFar , maxVal) ;
            }  
            return maxSoFar ;
        }
    }
}
