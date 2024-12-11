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
    int n = 0;
    ListNode trav = head;
    while(trav != null)
    {
        trav = trav.next;
        n++;
    }
    if(n==1){
        return null;
    }
    int middle = n/2;
    trav = head;
    for(int i = 0 ; i < middle-1;i++){
        trav = trav.next;
    }
    if(trav.next.next != null){
        trav.next = trav.next.next;
    }else{
        trav.next = null;
    }
    return head;    
    }
}
