class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length - 1 ;
        int mid = 0;

        if(nums[high] < target){
            return high + 1;
        }

        if(nums[0] > target){
            return 0 ;
        }

        while(low <= high){
            mid = low + (high - low)/2 ;
            if(nums[mid] > target){
                high = mid - 1 ;
            }else if(nums[mid] < target){
                low = mid + 1 ;
            }else{
                return mid ;
            }
        }

        if(nums[mid] > target){
            return mid ;
        }else if(nums[mid] < target){
            return mid + 1 ;
        }


        return mid ;
    }
}
