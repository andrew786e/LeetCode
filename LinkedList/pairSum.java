class Solution {
    public int pairSum(ListNode head) {
        ListNode reference = head ;
        int sizeLL = 0 ;
        int position = 0 ;
        int max = 1 ;

        Map<Integer , Integer> twinPair = new HashMap<>() ;

        // Get size of a linkedList
        while(reference != null){
            sizeLL++ ;
            reference = reference.next ;
        }

        // Check for twins
        while(head != null){
            // Using a similar method for two some where the pair to be found is stored
            if(!twinPair.containsKey(position) && position <= (sizeLL/2) - 1){
                twinPair.put(sizeLL - 1 - position , head.val) ;
            }else{
                max = Math.max(twinPair.get(position) + head.val , max) ;
            }
            head = head.next ;
            position++ ;
        }

        return max ;
    }
}
