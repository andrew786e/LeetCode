// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

import java.util.Arrays ;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums) ;
        List<List<Integer>> threeSumAns = new ArrayList<>();
        int sizeOfArray = nums.length ;
        int target = 0 ;
        int newTargetVal ;
        int j ;
        int k ;
        for(int i = 0 ; i < sizeOfArray - 2 ; i++){
            // Prevents the addition of duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // New targetVal for innerLoop
            newTargetVal = target - nums[i] ;
            j = i + 1;
            k = sizeOfArray - 1 ;
            while(j < k){
                // Use two Sum algorithm to solve
                int innerSum = (nums[j] + nums[k]) ;
                if(innerSum == newTargetVal){
                    threeSumAns.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // Prevents the addition of duplicates
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                }

                if(innerSum > newTargetVal){
                    k-- ;
                }else{
                    j++;
                }

            }
        }
        return threeSumAns ;
    }
}