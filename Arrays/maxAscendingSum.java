class Solution {
    public int maxAscendingSum(int[] nums) {
        int count = nums[0] ;
        int maxNum = nums[0] ;
        int ans = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            if(maxNum >= nums[i]){
                count = nums[i] ;
            }else{
                count += nums[i] ;
            }
            maxNum = nums[i] ;

            ans = Math.max(ans , count) ;
        }  

        return ans ;
    }
}
