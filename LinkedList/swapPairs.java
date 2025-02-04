class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null){
            return head ;
        }

        if(head.next == null){
            return head ;
        }


        ListNode prev = null ;
        ListNode current = head ;
        ListNode future = head.next ;
        ListNode ans = future ; 

        while(current != null && future != null){
            current.next = future.next ;
            future.next = current ; 

            if(prev != null){
                prev.next = future ;
            }

            prev = current ;
            current = current.next ; 

            if(current == null || current.next == null){
                future = null ;
            }else{
                future = current.next ;
            }
        }

        return ans ;

    }
}
