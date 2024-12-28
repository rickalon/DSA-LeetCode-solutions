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
    private Integer prev = null;
    private Integer min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
       inorder(root);
       return min;
    }

    public void inorder(TreeNode node)
    {
        if(node==null){
            return;
        }
        inorder(node.left);
        if(prev!=null){
            min = Math.min(node.val-prev,min);
        }
        prev =node.val;
        inorder(node.right);

    }
}
