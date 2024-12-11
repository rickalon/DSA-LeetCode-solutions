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
    public ListNode oddEvenList(ListNode head) {
    ListNode trav = head;
    ListNode evens = new ListNode();
    ListNode last = null;
    ListNode evensTrav = evens;
    while(trav!=null){
        if(trav.next != null){
            ListNode aux = trav.next;
            last = trav;
            trav.next = trav.next.next;
            trav = trav.next;
            evensTrav.next = aux;
            evensTrav = evensTrav.next;
        }else{
            last = null;
            evensTrav.next = null;
            trav.next = evens.next;
            break;
        }
    }
    if(last != null){
        last.next = evens.next;
    }
    return head;    
    }
}
