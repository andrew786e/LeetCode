class Solution {
    // Solves problem using dynamic Programming 
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            List<List<Integer>> result = new ArrayList<>() ;
            List<Integer> emptyList = new ArrayList<>() ;
            result.add(emptyList) ;
            return result ; 
        }

        List<List<Integer>> permutations = permute(Arrays.copyOfRange( nums, 1 , nums.length)) ;
        List<List<Integer>> result = new ArrayList<>() ;

        for(int i = 0 ; i < permutations.size() ; i++){
            for(int j = 0 ; j <= permutations.get(i).size() ; j++){
                ArrayList<Integer> permute  = new ArrayList<>(permutations.get(i)) ;
                permute.add(j , nums[0]) ;
                result.add(permute) ;
            }
        }

        return result ;
    }
}
