class Solution {
    PriorityQueue<Integer> maxQueue  = new PriorityQueue<>(Comparator.reverseOrder()) ; 

    public int findKthLargest(int[] nums, int k) {
        int ans = 0 ;

        for(int i : nums){
            maxQueue.add(i) ;
        }

        for(int i = 0 ; i < k ; i++){
            ans = maxQueue.poll() ;
        }

        return ans ;
    }
}
