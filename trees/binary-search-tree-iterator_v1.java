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
class BSTIterator {
    LinkedList<Integer> list;
    public BSTIterator(TreeNode root) {
        list = new LinkedList<>();
        core(root);
    }

    public void core(TreeNode node)
    {
        if(node==null) return;
        core(node.left);
        list.add(node.val);
        core(node.right);
    }
    
    public int next() {
        return list.removeFirst();
    }
    
    public boolean hasNext() {
        if(list.isEmpty()) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
