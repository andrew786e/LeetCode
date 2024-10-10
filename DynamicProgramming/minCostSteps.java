class Solution {

    Map<Integer , Integer> minStepsAtPoints = new HashMap<>() ;

    public int minCostClimbingStairs(int[] cost) {
        int minCostPoints = dfs(0 , cost) ;
        int minCost = Math.min(minStepsAtPoints.get(0) , minStepsAtPoints.get(1)) ;

        return minCost ;
    }

    public int dfs(int position , int[] cost){

        if(position >= cost.length){
            return 0 ;
        }

        if(minStepsAtPoints.containsKey(position)){
            return minStepsAtPoints.get(position) ;
        }


        int minStep = cost[position] + Math.min(dfs(position + 1 , cost) , dfs(position + 2 , cost) ) ;

        minStepsAtPoints.put(position , minStep) ;

        return minStep ;
    }
}
