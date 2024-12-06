class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {

        List<int[]> pairs = new ArrayList<>() ;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ;

        for(int i = 0 ; i < nums1.length ; i++){
            pairs.add(new int[]{nums1[i] , nums2[i]}) ;
        }

        pairs.sort((a, b) -> b[1] - a[1]);

        long sum = 0 ;
        long max = -1L ;


        for(int[] pair : pairs ){
            int num1 = pair[0] ;
            int num2 = pair[1] ;

            sum += num1 ;

            minHeap.add(num1) ;

            if(minHeap.size() > k){
                sum -= minHeap.poll() ;
            }

            if(minHeap.size() == k){
                max = Math.max(max , sum * num2) ;
            }
        }

        return max ;
    }
}
