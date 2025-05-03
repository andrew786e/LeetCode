class Solution {
    public int jump(int[] nums) {
        int l = 0 ;
        int r = 0 ;
        int count= 0 ;
        int newR = 0 ;

        while(r  < nums.length - 1){

            for(int i = l ;  i <= r ; i++){
                newR = Math.max(newR , i + nums[i]) ;
            }

            l = r + 1 ;
            r = newR ;

            count++ ;
        }

        return count  ;
    }
}
