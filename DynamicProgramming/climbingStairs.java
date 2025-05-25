class Solution {

    private int[] stairs ;

    public int climbStairs(int n) {
        stairs = new int[n] ;
        Arrays.fill(stairs , -1) ;

        return dfs(n , 0) ;

    }

    public int dfs(int n , int stair){

        if(stair > n ){
            return 0 ;
        }

        if(stair == n){
            return 1 ;
        }

        if(stairs[stair] >= 0){
            return stairs[stair] ;
        }

        int path = dfs(n , stair + 1) + dfs(n , stair + 2) ;
        stairs[stair] = path ;

        return path ;
    }

}
