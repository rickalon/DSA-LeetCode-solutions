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
    public int countNodes(TreeNode root) {
        return bfsIterator(root);
    }

    public int bfsIterator(TreeNode node)
    {
        if(node!=null){
            int leftResult = bfsIterator(node.left);
            int rightResult = bfsIterator(node.right);
            return 1 + leftResult + rightResult; 
        }else{
            return 0;
        }
    }
}
