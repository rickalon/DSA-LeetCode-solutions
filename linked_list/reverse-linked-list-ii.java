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
 enum Casos{
    CAS1,
    CAS2,
    CAS3,
 }
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }
        ListNode leftA = head;
        ListNode leftD = head;
        int n = 1;
        while(n < left){
            leftA = leftD;
            leftD= leftD.next;
            n++;
        }
        ListNode rightA = leftD;
        ListNode rightD = leftD;
        while(n<=right){
            rightA = rightD;
            rightD = rightD.next;
            n++;
        }
        Casos casoA = Casos.CAS1;
        Casos casoB = Casos.CAS1;
        if(leftA == leftD){
            casoA =  Casos.CAS2;
        }
        if(rightD == null){
            casoB =  Casos.CAS3;
        }
        ListNode current = leftD;
        ListNode prev = null;
        while(current != rightD)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
            if(casoA == Casos.CAS1 && casoB == Casos.CAS1){
                leftA.next = prev;
                leftD.next = rightD;
            }else if(casoA == Casos.CAS2 && casoB == Casos.CAS3){
                head = prev;
            }else if(casoA == Casos.CAS2 && casoB == Casos.CAS1){
                head = prev;
                leftA.next = rightD;
            }else if(casoA == Casos.CAS1 && casoB == Casos.CAS3){
                leftA.next = prev;
            }
        return head;
    }
}
