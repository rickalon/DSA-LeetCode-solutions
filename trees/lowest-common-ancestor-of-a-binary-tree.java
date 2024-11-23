/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode value;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        rrt(root,p,q);
        return value;
    }

    public int rrt(TreeNode node,TreeNode p,TreeNode q){
        if(node!=null){
            int left = rrt(node.left,p,q);
            int right = rrt(node.right,p,q);
            if(left+right==2){
                value = node;
                return 3;
            }
            if(node.val == p.val || node.val == q.val){
                if(left+right==1){
                    value = node;
                    return 3;
                }
                return 1 + left + right;
            }
            return left+right;
            }else{
                 return 0;
        }
    }
}
