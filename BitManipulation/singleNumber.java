class Solution {
    public int singleNumber(int[] nums) {
        int numCounter = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            numCounter ^= nums[i] ;
        }

        return numCounter ;
    }
}
