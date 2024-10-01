class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0.0;
        int firstElementSubarray = 0; // Keeps track of the firstElement in subarray
        int sumNums = 0 ;

        for(int i = 0 ; i < nums.length  ; i++){
            sumNums += nums[i] ;
            // When value is greater remove the last value 
            if( i + 1 > k){
                sumNums -= nums[firstElementSubarray] ;
                firstElementSubarray += 1 ;
                ans = Math.max(ans , (double)sumNums / k ) ;
            }else if(i + 1 == k){
                ans = (double)sumNums/k ;
            }
        }
        return ans ;
    }
}
