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
    public TreeNode sortedArrayToBST(int[] nums) {
    return solve(nums,0,nums.length-1);
    }
    public TreeNode solve(int[] nums,int left,int right){
        if(left>right)
            return null;
        int mid = left + (right-left)/2;
        TreeNode nodeL = solve(nums,left,mid-1);
        TreeNode nodeR = solve(nums,mid+1,right);
        TreeNode node = new TreeNode(nums[mid],nodeL,nodeR);
        return node;
    }
}
