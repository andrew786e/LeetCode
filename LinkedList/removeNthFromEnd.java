class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode copy = head ;
        int count = 0;

        // Find the length of the linked list
        while(head != null){
            head = head.next ;
            count++ ;
        }


        head = copy ;

        // Check if first element is the element that needs to be removed
        if(count - n == 0){
            return head.next ;
        }


        ListNode prev = head ;
        ListNode current = head.next ;
        ListNode temp ;
        ListNode answer = null ;
        int position = 0 ;

        // Keep track of prev and current
        while(current != null){
            position++ ;
            if(count - n == position){
                prev.next = current.next ; 
                break ;
            }

            temp = current ;
            current = current.next ;
            prev = temp ;
        }

        return copy;
    }
}
