
class Solution {
    public int sumNumbers(TreeNode root) {
        int[] counter = {0};
        summer(root,"",counter);
        return counter[0];
    }
    public int summer(TreeNode node,String str,int[] counter){
        if(node!=null){
            if(node.left == null && node.right ==null){
                str +=node.val;
                counter[0] += Integer.valueOf(str);
                return;
            }
            summer(node.left,str+node.val,counter);
            summer(node.right,str+node.val,counter);
        }
    }
}
