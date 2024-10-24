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
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> listValues = new LinkedList<>();
    Queue<TreeNode> qu = new LinkedList<>();
    qu.offer(root);
    boolean puesto = false;
    while(!qu.isEmpty()){
    int size = qu.size();
    puesto = false;
    while(size!=0){
    TreeNode aux = qu.poll();
    if(aux!=null){
            if(!puesto){
            listValues.add(aux.val);
            puesto = true;
            }
            qu.offer(aux.right);
            qu.offer(aux.left);
    }
    size--;
    }
    }
    return listValues;
    }
}
