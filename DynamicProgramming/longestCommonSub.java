class Solution {
    int[][] memo ;
    int text1Size = 0 ;
    int text2Size = 0 ;
    String text1 ; 
    String text2 ;

    public int longestCommonSubsequence(String text1, String text2) {
        memo = new int[text1.length()][text2.length()] ;
        text1Size = text1.length() ;
        text2Size = text2.length() ;
        this.text1 = text1 ;
        this.text2 = text2 ;

        for(int i = 0 ; i < text1Size ; i++){
            for(int j = 0 ; j < text2Size ; j++){
                memo[i][j] = -1 ;
            }
        }


        return LCS(0 , 0) ;
    }

    public int LCS(int text1Position , int text2Position){

        if(text1Position == text1Size || text2Position == text2Size ){
            return 0 ;
        }

        if(memo[text1Position][text2Position] != -1){
            return memo[text1Position][text2Position] ;
        }

        if(text1.charAt(text1Position) == text2.charAt(text2Position)){
            return 1 + LCS(text1Position + 1 , text2Position + 1) ;
        }else{
            int maxSubstring = Math.max(LCS(text1Position + 1 , text2Position) , LCS(text1Position , text2Position + 1) ) ;
            memo[text1Position][text2Position] = maxSubstring ;
            return maxSubstring ;
        }
    }
}
