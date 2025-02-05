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
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode aux = head;
        while(aux!=null){
            q.offer(aux);
            aux = aux.next;
        }
        aux = new ListNode();
        head = aux;
        while(!q.isEmpty()){
            aux.next = q.poll();
            aux = aux.next;
            aux.next = null;
        }
        return head.next;
    }
}
