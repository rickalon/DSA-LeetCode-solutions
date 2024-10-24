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
    public int goodNodes(TreeNode root) {
        return dfsTraversal(root,root.val);
    }

    public int dfsTraversal(TreeNode node, int max)
    {
        if(node != null)
        {
            int xleft = dfsTraversal(node.left, Math.max(max,node.val));
            int xright = dfsTraversal(node.right, Math.max(max,node.val));
            int result = (max <= node.val)?1:0;
            return xleft + xright + result;
        }else
        {
            return 0;
        }
    }

}
