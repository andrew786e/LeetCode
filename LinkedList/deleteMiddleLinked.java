/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null ;
        }

        ListNode countNode = head ;
        ListNode answer = head ;
        int nodeCounter = 0 ;
        ListNode prev ;
        ListNode current ;

        while(head != null){
            head = head.next ;
            nodeCounter += 1 ;
        }

        int middle = nodeCounter/2 ;
        nodeCounter = 1;
        current = countNode.next  ;
        prev = countNode ;

        while(current != null){
            if(middle == nodeCounter){
                prev.next = current.next ;
                break ;
            }
            prev = current ;
            current = current.next ;
            nodeCounter += 1 ;
        }

        return answer ;
    }
}
