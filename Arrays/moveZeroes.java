class Solution {
    public void moveZeroes(int[] nums) {

        if(nums.length == 1){
            return ;
        }

        for(int i = 0 , j = 1 ; j < nums.length; ){
            if(nums[i] == 0 && nums[j] != 0 ){
                int temp = nums[i] ;
                nums[i] = nums[j] ;
                nums[j] = temp ;
            }
            
            if(nums[i] != 0 ){
                i++ ;
                j++ ;
                continue ;
            }else if(nums[j] == 0){
                j++ ; 
            }

        }
    }
}
