class Solution {
    public int maxSubArray(int[] nums) {

        // Talk about my approach 
        // What DS or Algorithm 
        // Ask this sounds good
        // Run through an example

        int max = -10000 ;
        int i = 0 ;
        int sum = max ;

        while( i < nums.length){
            sum += nums[i] ;
            if(sum <  nums[i]){ 
                sum = nums[i] ;
            }
            max = Math.max(sum , max ) ;
            i++ ; 
        } 

        return max ;
    }
}
