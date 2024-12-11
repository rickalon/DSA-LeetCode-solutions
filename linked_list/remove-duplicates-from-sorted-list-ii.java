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
    public ListNode deleteDuplicates(ListNode head) {
    ListNode result = new ListNode();
    ListNode sol = result;
    ListNode prev = null;
    while(head!=null){
        if(prev==null || prev.val != head.val){
            prev = head;
            if((head.next == null) || (head.next != null && head.next.val!=head.val)){
                result.next = head;
                result = result.next;
            }
        }
        head = head.next;
    }
    result.next = null;   
    return sol.next;
    }
}
