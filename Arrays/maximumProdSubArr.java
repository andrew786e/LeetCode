// Given an integer array nums, find a 
// subarray
//  that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

 
public class maximumProdSubArr {
    class Solution {
        public int maxProduct(int[] nums) {
            int maxVal = nums[0] ;
            int maxSoFar = nums[0] ;
            int minSoFar = nums[0] ;

            for(int i = 1 ; i < nums.length ; i++){
                int temp = maxSoFar ;
                maxSoFar = Math.max(nums[i] , Math.max(nums[i] * maxSoFar , nums[i] * minSoFar)) ;
                minSoFar = Math.min(nums[i] , Math.min(nums[i] * temp , nums[i] * minSoFar)) ;
                maxVal = Math.max(maxVal , maxSoFar) ;
            }
            return maxVal ;
        }
    }
}
