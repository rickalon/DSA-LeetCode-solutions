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
    int counter = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;

        sum(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

        return counter;

    }

    public void sum(TreeNode node,int sum,long current)
    {
        if(node == null)return;

        current += node.val;
        if(sum==current){
            counter++;
        }
        sum(node.left,sum,current);
        sum(node.right,sum,current);
    }
}
