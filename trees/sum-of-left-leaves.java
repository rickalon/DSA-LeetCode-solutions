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
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> list = new ArrayList<>();
    Queue<TreeNode> cola = new LinkedList<>();
    cola.offer(root);

    while(!cola.isEmpty()){
        int size = cola.size();
        int sizeT = 0;
        long average = 0;
        while(size>0){
            TreeNode aux = cola.poll();
            if(aux!=null){
                average += aux.val;
                sizeT++;
                cola.offer(aux.left);
                cola.offer(aux.right);
            }
            size--;
        }
        if(sizeT!=0){
            list.add(((double)average)/sizeT);
        }
    }   
    return list;  
    }
}
