// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
// find two numbers such that they add up to a specific target number. Let these two numbers
//  be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sizeOfArray = numbers.length ;
        int[] targetVals = new int[2] ;
        int compareVal ;
        for(int i = 0 , j = sizeOfArray - 1 ; i < j ;){
            compareVal = numbers[i] + numbers[j] ;
        
            if(compareVal == target){
                targetVals[0] = i + 1;
                targetVals[1] = j + 1;
                break ;
            }

            if(compareVal > target){
                j-- ;
            }else{
                i++ ;
            }
        }
        return targetVals ;
    }
}