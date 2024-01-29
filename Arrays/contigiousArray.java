// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
import java.util.HashMap;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer , Integer> possibleAnswers = new HashMap<>() ;
        possibleAnswers.put(0 , -1) ;
        int count = 0 ;
        int maxLength = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            count = count + (nums[i] == 0 ? -1 : 1) ;

            if(possibleAnswers.containsKey(count)){
                maxLength = Math.max(maxLength , i - possibleAnswers.get(count)) ;
            }else{
                possibleAnswers.put(count , i ) ;
            }
        }

        return maxLength; 
    }
}