class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0 ;
        int j = 0 ; 
        int numberOfZeros = 1 ;
        boolean zeroEncountered = false ;
        while(j < nums.length){
            if(nums[j] == 0){
                zeroEncountered = false ;
                numberOfZeros-- ;
            }

            if(numberOfZeros< 0){
                if(nums[i] == 0){
                    numberOfZeros++ ;
                }
                i++ ;
            }

            j++ ;
        }

        return j - i - 1;
    }
}
