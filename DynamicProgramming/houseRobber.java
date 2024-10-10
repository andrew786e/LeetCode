class Solution {

    Map<Integer , Integer> maxPos = new HashMap<>() ;

    public int rob(int[] nums) {
        int ans = dfs(0 , nums) ;
        return ans ;
    }

    public int dfs(int position , int[] num){

        if(position >= num.length){
            return 0 ;
        }

        if(maxPos.containsKey(position)){
            return maxPos.get(position) ;
        }

        int currentPosition = num[position] + dfs(position + 2 , num) ; 
        int nextPosition = dfs(position + 1 , num) ;

        maxPos.put(position , Math.max(currentPosition , nextPosition)) ;

        return Math.max(currentPosition , nextPosition) ;
    }
}
