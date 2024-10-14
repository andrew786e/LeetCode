class Solution {
    public int pivotIndex(int[] nums) {

        if(nums.length == 1 ){
            return 0 ;
        }

        int prefix = 0 ;
        int suffix = 0 ;
        int[] prefixArr = new int[nums.length] ;
        int[] suffixArr = new int[nums.length] ;

        for(int i = 0 , j = nums.length - 1 ; i < nums.length ; i++ , j--){
            prefix += nums[i] ;
            suffix += nums[j] ;

            prefixArr[i] = prefix ;
            suffixArr[j] = suffix ;
        }

        if(suffixArr[1] == 0){
            return 0 ;
        }

        for(int i = 1 ; i < nums.length - 1 ; i++){
            if(prefixArr[i - 1] == suffixArr[i + 1]){
                return i  ;
            }
        }

        if(prefixArr[nums.length - 2] == 0){
            return nums.length - 1;
        }

        return - 1 ;     
    }
}
