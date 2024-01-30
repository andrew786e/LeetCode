// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSeq {
    class Solution {
        public int longestConsecutive(int[] nums) {
            int maxLength = 0 ;
            Set<Integer> numSet = new HashSet<>() ;
            for(int i = 0 ; i < nums.length ; i++){
                numSet.add(nums[i]) ;
            }

            for(int i : numSet){
                if(!numSet.contains(i - 1)){
                    int length = 0 ;
                    while(numSet.contains(i + length)){
                        length = length + 1 ;
                    }
                    maxLength = Math.max(length , maxLength) ;
                }
            }

            return maxLength ;
        }
    }
}
