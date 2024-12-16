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
enum Direction{
    LEFT,
    RIGHT
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> list = new LinkedList<>();
    List<Integer> auxList = new LinkedList<>();

    queue.offer(root);
    Direction dir = Direction.RIGHT;

    while(!queue.isEmpty()){
        int size = queue.size();
        while(size>0){
            TreeNode node = queue.poll();
            if(node!=null){
                auxList.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            }
            size--;
        }
        if(size + queue.size()==0){
            break;
        }
        if(dir == Direction.RIGHT){
            dir = Direction.LEFT;
        }else{
            dir = Direction.RIGHT;
            auxList = new LinkedList<>(auxList.reversed());
        }
        list.add(auxList);
        auxList = new LinkedList<>();
    }
    return list;
    }
}
