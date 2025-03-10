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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
    if(head==null){
        return null;
    }
    List<Integer> list = new ArrayList<>();
    while(head!=null){
        list.add(head.val);
        head = head.next;
    }
    int left = 0;
    int right = list.size()-1;
    int mid = left+(right-left)/2;
    TreeNode root = new TreeNode(list.get(mid));
    root.left = crt(root,list,left,mid-1);
    root.right = crt(root,list,mid+1,right);
    return root;    
    }

    public TreeNode crt(TreeNode root,List<Integer> list,int left,int right){
        if(left <= right){
            int mid = left + (right-left)/2;
            TreeNode nuevaRoot = new TreeNode(list.get(mid));
            nuevaRoot.left = crt(root,list,left,mid-1);
            nuevaRoot.right = crt(root,list,mid+1,right);
            return nuevaRoot;
        }else{
            return null;
        }
    }
}
