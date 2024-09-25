class Solution {
    public boolean increasingTriplet(int[] nums) {

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if(nums.length < 3){
            return false ; 
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(firstSmallest >= nums[i]){
                firstSmallest = nums[i] ;
            }else if(secondSmallest >= nums[i] ){
                secondSmallest = nums[i] ;
            }else if((nums[i] > secondSmallest) && (nums[i] > firstSmallest)){
                return true ;
            }
        }

        return false ;
    }
}
