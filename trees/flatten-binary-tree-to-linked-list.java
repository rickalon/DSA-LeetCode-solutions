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
    public void flatten(TreeNode root) {
       flat(root);
    }
    public TreeNode flat(TreeNode node) {
        if(node!=null){
           if(node.left==null && node.right==null){
                return node;
           }else if(node.left==null && node.right!=null){
                return flat(node.right);
           }else if(node.left!=null && node.right == null){
                node.right = node.left;
                node.left = null;
                return flat(node.right);
           }else{
                TreeNode leftLast = flat(node.left);
                leftLast.right = node.right;
                node.right = node.left;
                node.left = null;
                return flat(node.right);
           }
        }
        return null;
    }
}
