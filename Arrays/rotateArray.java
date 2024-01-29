// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

public class rotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length ;

            reverse(0 , nums.length - 1, nums) ;
            reverse(0 , k - 1 , nums) ;
            reverse(k , nums.length - 1 , nums) ;
        }

        public void  reverse(int begin , int end , int[]nums){
            int temp ;
            while(begin < end){
                temp = nums[begin] ;
                nums[begin] = nums[end] ;
                nums[end] = temp ;
                begin++ ;
                end-- ;
            }
        }
    }   
}
