class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> elementList1 = new HashSet<>() ;
        HashSet<Integer> elementList2 = new HashSet<>() ;
        List<Integer> distNum1 = new ArrayList<>() ;
        List<Integer> distNum2 = new ArrayList<>() ;
        List<List<Integer>> answer = new ArrayList<>() ;

        for(int i = 0 ; i < nums1.length ; i++){
            elementList1.add(nums1[i]) ;
        }

        for(int i = 0 ; i < nums2.length ; i++){
            elementList2.add(nums2[i]) ;
        }

        for(int nums : elementList1){
            if(!elementList2.contains(nums)){
                distNum1.add(nums) ;
            }
        }

        for(int nums : elementList2){
            if(!elementList1.contains(nums)){
                distNum2.add(nums) ;
            }
        }

        answer.add(distNum1) ;
        answer.add(distNum2) ;
        return answer ;
    }
}
