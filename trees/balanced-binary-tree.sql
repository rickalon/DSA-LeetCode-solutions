/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isBalanced(TreeNode* root) {
    return numberHeightBalance(root);
    }
private:
    bool numberHeightBalance(TreeNode* root){return balancedTree(root)!=-1;};

    int balancedTree(TreeNode* root)
    {
        if(!root) return 0;
        int left = balancedTree(root->left);
        if(left==-1) return -1;
        int right = balancedTree(root->right);
        if(right==-1) return -1;
        if(abs(left-right) <= 1){
            return max(left,right) + 1;
        }else{
            return -1;
        }


    }
};
