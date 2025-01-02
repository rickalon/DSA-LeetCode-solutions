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
    public int max;
    public int longestZigZag(TreeNode root) {
        max = 0;
        core(root,0,0);
        core(root,1,0);
        return max;
    }

    public void core(TreeNode node, int dir, int length)
    {
        if(node==null) return;
        max = Math.max(length,max);
        if(dir==0){
            core(node.right,1,length+1);
            core(node.left,0,1);
        }else{
            core(node.left,0,length+1);
            core(node.right,1,1);
        }
    }
}
