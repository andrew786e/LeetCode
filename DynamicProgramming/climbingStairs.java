class Solution {
    Map<Integer , Integer> storeValues = new HashMap<>() ;

    public int climbStairs(int n) {
        int distinctPosition = dfs(n , 0) ;
        return distinctPosition ;
    }

    public int dfs(int n , int currentPosition){
        if(currentPosition == n){
            return 1 ;
        }

        if(currentPosition > n ){
            return 0 ;
        }

        if(storeValues.containsKey(currentPosition)){
            return storeValues.get(currentPosition) ;
        }

        int result = dfs(n , currentPosition + 1) + dfs(n , currentPosition + 2) ;

        storeValues.put(currentPosition , result) ;

        return result ;
    }
}
