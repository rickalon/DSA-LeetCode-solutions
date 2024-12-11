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
    public int pairSum(ListNode head) {
    ListNode trav = head;
    int n = 0;
    int currentSum = 0;
    int maxSum = 0;
    while(trav != null)
    {
        n++;
        trav = trav.next;
    }
    int middle = (n/2);
    ListNode secondTrav = head;
    int[] firstQ = new int[middle];
    for(int i = 0;i<middle;i++){
        firstQ[i]=secondTrav.val;
        secondTrav = secondTrav.next;
    }
    for(int i = middle; i < n ; i++){
        currentSum = secondTrav.val+firstQ[(n-1)-i];
        maxSum = Math.max(currentSum,maxSum);
        secondTrav = secondTrav.next;
    }
    return maxSum;
    }
}
