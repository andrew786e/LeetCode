class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int minLength = 1 ;
        int maxLength = 1 ;
        int min = nums[0] ;
        int max = nums[0] ;
        int ans = 1 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(min > nums[i]){
                minLength += 1 ;
            }else{
                minLength = 1 ; 
            }

            if(max < nums[i]){
                maxLength += 1 ;
            }else{
                maxLength = 1 ; 
            }

            min = nums[i] ;
            max = nums[i] ;

            ans = Math.max(ans , minLength) ;
            ans = Math.max(ans , maxLength) ;
        }

        return ans ;
    }
}
