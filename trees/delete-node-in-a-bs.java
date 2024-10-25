class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root, key);
    }

    public TreeNode delete(TreeNode node, int key) {
        if (node == null) {
            return null;  
        }

        if (key < node.val) {
            node.left = delete(node.left, key);  
        } else if (key > node.val) {
            node.right = delete(node.right, key);  
        } else {
            if (node.left == null) {
                return node.right; 
            } else if (node.right == null) {
                return node.left;  
            } else {
                TreeNode minNode = findMin(node.right);  
                node.val = minNode.val; 
                node.right = delete(node.right, minNode.val);  
            }
        }
        return node;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;  
        }
        return node;
    }
}
