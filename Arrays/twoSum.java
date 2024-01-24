import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer , Integer> dict = new Hashtable<>() ;
        int[] targetVal = new int[2] ;

        for(int i = 0; i < nums.length ; i++){
            // Check if Key Exists
            // If the number is in the dictionary then we have found the matching pair
            if(dict.containsKey(nums[i])){
                targetVal[0] = dict.get(nums[i]) ;
                targetVal[1] = i ;
                break ;
            }else{
                // Enter key as a value to be sought for and store 
                // The index of the corresponding value 
                int keyVal = target - nums[i] ;
                dict.put(keyVal , i) ;
            }
        } 
        return targetVal ;
    }
}