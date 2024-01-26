// Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.

// The length of each part should be as equal as possible: no two parts should have a size differing by more than one. 
// This may lead to some parts being null.

// The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have 
// a size greater than or equal to parts occurring later.

// Return an array of the k parts.

public class splitLinkedList {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int sizeOfLinkedList = 0;
        ListNode currentNode = head ;
    
        while(head != null){
            sizeOfLinkedList++ ;
            head = head.next ;
        }
    
        int quotient = sizeOfLinkedList / k ; //Size of List
        int extraElements = sizeOfLinkedList % k ; //Number of extra elements
        ListNode[] ans = new ListNode[k] ;
    
        for(int i = 0 ; i < k ; i++){
            // Head of ListNode
            ListNode newHead = currentNode ;
            // Add extraElements if needed
            int sizeOfList = quotient + ((i < extraElements) ? 1 : 0) ;
            for(int j = 1 ; j < sizeOfList; j++){
                if(currentNode != null){
                    currentNode =  currentNode.next ;
                }
            }
    
            if(currentNode != null){
                ListNode prev = currentNode ;
                currentNode = currentNode.next ; 
                prev.next = null ;
            }
    
            ans[i] = newHead ;
        }
        return ans ;
    }
}
