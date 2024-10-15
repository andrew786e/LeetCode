class Solution {
    private int[][] memo ; 
    public int uniquePaths(int m, int n) {
        memo = new int[m][n] ;
        int ans = dfs(m , n , 0 ,0) ;
        return ans ;
    }

    public int dfs(int m , int n , int currentN , int currentM){
        if(currentM > m || currentN > n){
            return 0;
        }

        if(currentM == m - 1 || currentN == n - 1){
            return 1;
        }

        if(memo[currentM][currentN] > 0 ){
            return memo[currentM][currentN] ;
        }

        int counter = dfs(m , n , currentN + 1 , currentM) + dfs(m , n , currentN , currentM + 1) ;
        memo[currentM][currentN] = counter ;

        return counter ;
    }
}
