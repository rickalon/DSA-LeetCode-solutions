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
    public TreeNode pruneTree(TreeNode root) {
        if(core(root)==0){
            return null;
        };
        return root;
    }

    public int core(TreeNode root)
    {
        if(root!=null){
            int left = core(root.left);
            int right = core(root.right);
            if(left == 0){
                root.left = null;
            }
            if(right == 0){
                root.right = null;
            }
            if((left != 0 || right !=0 || root.val !=0)){
                return 1;
            }
        }
    return 0;

    }
}

class Solution {
    public int maxDepth(Node root) {
    if(root!=null && root.children.isEmpty()){
        return 1;
    }
    if(root!=null){
        int max = Integer.MIN_VALUE;
        for(Node node : root.children)
        {
           
           int res = maxDepth(node);
           max = Math.max(max,res);
        }
        return 1 + max;
    }
    return 0;
    }
}
