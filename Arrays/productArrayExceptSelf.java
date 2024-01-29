// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements 
// of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

public class productArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] leftProduct = new int[nums.length] ;
            int[] rightProduct = new int[nums.length] ;
            int[] answer = new int[nums.length];

            int prefix = 1;
            int postfix = 1;
            for(int i = 0 , j = nums.length - 1 ; i < nums.length ; i++ ,j--){
                prefix = prefix * nums[i] ;
                postfix = postfix * nums[j] ;
                leftProduct[i] = prefix ;
                rightProduct[j] = postfix ;
            }

            for(int i = 0 ; i < nums.length; i++){
                if(i == 0){
                    answer[i] = rightProduct[i + 1] ;
                }else if(i == nums.length - 1){
                    answer[i] = leftProduct[i - 1] ;
                }else{
                    answer[i] = rightProduct[i+1] * leftProduct[i - 1] ;
                }
            }

            return answer ;
        }
    }
}
