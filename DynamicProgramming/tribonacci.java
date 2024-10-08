class Solution {
    public int tribonacci(int n) {

        int[] baseNum  = new int[3] ;
        int ans = 0;

        baseNum[0] = 0 ;
        baseNum[1] = 1 ;
        baseNum[2] = 1 ;

        if(n < 3){
            return baseNum[n] ;
        }

        for(int i = 3 ; i <= n ; i++){
            ans = baseNum[0] + baseNum[1] + baseNum[2] ;
            baseNum[0] = baseNum[1] ;
            baseNum[1] = baseNum[2] ;
            baseNum[2] = ans ; 
        }



        return ans ;
    }
}
