class Solution {
    public int findPeakElement(int[] nums) {
        
        int maxIndex = -1;

        if(nums.length == 1 ){
            return 0 ;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0){
                if(nums[i] > nums[i + 1]){
                    maxIndex = i ;
                }
            }else if(i == (nums.length - 1 )){
                if(nums[i] > nums[i - 1] ){
                    if(maxIndex < 0){
                        maxIndex = i ;
                    }else if(nums[i] > nums[maxIndex]){
                        maxIndex = i ;
                    }
                }
            }else {
                if(nums[i] > nums[i + 1]  && nums[i] > nums[i - 1]){
                    if(maxIndex < 0){
                        maxIndex = i ;
                    }else if(nums[i] > nums[maxIndex]){
                        maxIndex = i ;
                    }
                }
            }
        }

        return maxIndex ;
    }
}
