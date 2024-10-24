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
    public int maxLevelSum(TreeNode root) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        bfsTraversal(root,hm,1);
        int max = Integer.MIN_VALUE;
        int level = -1;
        for(Integer val : hm.keySet()){
            if(hm.get(val)>max){
                level = val.intValue();
            }
            max = Math.max(max,hm.get(val));
        }
        return level;
    }

    public void bfsTraversal(TreeNode node, HashMap<Integer,Integer> hm, int depth){
    if(node != null)
    {
        if(hm.containsKey(depth)){
            hm.put(depth,hm.get(depth)+node.val);
        }else{
            hm.put(depth,node.val);
        }
        bfsTraversal(node.left,hm,depth+1);
        bfsTraversal(node.right,hm,depth+1);
    }
    }
}
