class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0 ;
        int waterVolume ;
        for(int i = 0 , j = height.length - 1 ; i < j ; ){
            if(height[i] >= height[j]){
                waterVolume = height[j]  * (j - i) ;
                j-- ;
            }else{
                waterVolume = height[i]  * (j - i) ;
                i++ ;
            }
            maxWater = Math.max(maxWater , waterVolume) ;
        }  
        return maxWater ;
    }
}
