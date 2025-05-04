class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sumGas = Arrays.stream(gas).sum() ;
        int sumCost = Arrays.stream(cost).sum() ;

        int total = 0 ;
        int start = 0 ;


        if(sumCost > sumGas){
            return -1 ;
        }

        for(int i = 0 ; i < cost.length ; i++ ){
            total  += gas[i] - cost[i] ;

            if(total < 0){
                total = 0 ;
                start = i + 1 ;
            }
        }

        return start ;
    }
}
