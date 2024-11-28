class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer , Integer> pairs = new HashMap<>();
        int numOp = 0 ;

        // Solution similar to two sum in terms of compliment use 
        // Complement is used when the num is zero or doesnot exist 
        for(int num : nums){
            // Checks whether the current num is the answer
            if(pairs.getOrDefault(num , 0) > 0){
                pairs.put(num , pairs.get(num) - 1) ;
                numOp++ ;
            }else{
                // If not store the complememnt for the next encounter
                pairs.put(k - num , pairs.getOrDefault(k - num , 0) + 1) ;
            }
        }

        return numOp;
    }
}
