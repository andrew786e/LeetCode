// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
// If the two linked lists have no intersection at all, return null.

import java.util.HashMap; 
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode , Integer > keyPresent = new HashMap<ListNode , Integer>() ;

        while(headA != null){
            keyPresent.put(headA , 1) ;
            headA = headA.next ;
        }

        while(headB != null){
            if(keyPresent.containsKey(headB)){
                break ;
            } 
            headB = headB.next ;
        }

        return headB ;
    }
}