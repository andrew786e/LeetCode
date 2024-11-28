class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().orElseThrow() ;

        int left = 1 ;
        int right = max ;

        while(left < right ){
            int count = 0 ;
            int mid = left + (right - left )/ 2 ;

            for(int i = 0 ; i < piles.length ; i++){
                count += (piles[i] + mid - 1) / mid;
            }

            if(count > h){
                left = mid + 1;
            }else {
                right = mid ;
            }
        }
        return left ;
    }
}
