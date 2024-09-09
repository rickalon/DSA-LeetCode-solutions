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
    bool isValidBST(TreeNode* root) {
        return isCore(root,LONG_MIN,LONG_MAX);
    }
private:
    bool isCore(TreeNode* root,long min,long max){
        if(!root){
            return true;
        }
        if(root->val <= min || root->val >= max){
            return false;
        }
        return isCore(root->left,min,root->val) && isCore(root->right,root->val,max);

    }
};
