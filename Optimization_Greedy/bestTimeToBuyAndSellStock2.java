class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE ;
        int profit = 0 ;

        for(int i = 1 ; i < prices.length ; i++){
            profit = Math.max(profit , profit + prices[i] - prices[i -1]) ;
        }

        return profit ;
    }
}
