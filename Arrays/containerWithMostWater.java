public class containerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int maxAreaVal = 0 ;
            int arrSize = height.length - 1;
            int top ; 
            int width ;
            for(int i = 0 , j = arrSize ; i < j;){
                top = (height[j] < height[i] ? height[j] : height[i]) ;
                width = j - i ;
                maxAreaVal = Math.max(maxAreaVal , top * width) ;
                if(height[j] < height[i]){
                    j-- ;
                }else{
                    i++ ;
                }
            }
            return maxAreaVal ;
        }
    }
}
