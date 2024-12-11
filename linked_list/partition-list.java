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
    public ListNode partition(ListNode head, int x) {
    ListNode lower = new ListNode();
    ListNode more = new ListNode();
    ListNode lowerTrav = lower;
    ListNode moreTrav = more;
    ListNode trav = head;
    while(trav != null)
    {
        if(trav.val >= x){
            moreTrav.next = trav;
            moreTrav = moreTrav.next;
        }else{
            lowerTrav.next = trav;
            lowerTrav = lowerTrav.next;
        }
        trav = trav.next;
    }
    moreTrav.next = null;
    lowerTrav.next = more.next;
    return lower.next;
    }
}
