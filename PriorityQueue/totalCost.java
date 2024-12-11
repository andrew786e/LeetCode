class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<int[]> workerPriceHeap = new PriorityQueue<>(
            (a , b) -> {
                int costCompare = Integer.compare(a[0] , b[0]) ;

                if(costCompare == 0){
                    return Integer.compare(a[1] , b[1]) ;
                }

                return costCompare ;
            }) ;

        
        int left = 0 ;

        for(int i = 0 ; i < candidates ; i++){
            workerPriceHeap.add(new int[]{costs[i] , i , 1}) ;
            left++ ;
        }

        int right = costs.length - 1 ;

        for(int i = 0 ; i < candidates ; i++){
            if(left <= right){
                workerPriceHeap.add(new int[]{costs[right ] , right  , -1}) ;
                right-- ;
            }            
        }

        int[] currentVal = new int[3] ;
        long sum = 0 ;

        for(int i = 0 ; i < k ; i++){
           currentVal = workerPriceHeap.poll() ;
           sum += currentVal[0] ;

            if(left <= right){
                if(currentVal[2] == 1){
                    workerPriceHeap.add(new int[]{costs[left] , i , 1}) ;
                    left++ ;
                }else{
                    workerPriceHeap.add(new int[]{costs[right] , i , -1}) ;
                    right-- ;
                }
            }
        }

        return sum;
    }
}
