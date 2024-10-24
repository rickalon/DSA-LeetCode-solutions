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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        
        Stack<Integer> result1 = new Stack<>();
        Stack<Integer> result2 = new Stack<>();
        dfsTraversal(root1,result1);
        dfsTraversal(root2,result2);

        while(!result1.isEmpty() && !result2.isEmpty()){
            if(result1.pop().intValue() != result2.pop().intValue()){
                return false;
            }
        }
        return result1.size()==result2.size();

    }


    public void dfsTraversal(TreeNode node,Stack<Integer> stack){
        if(node==null){
            return;
        }
        if(node.left == null && node.right == null){
            stack.add(node.val);
            return;
        }
        dfsTraversal(node.left,stack);
        dfsTraversal(node.right,stack);
    }
}
