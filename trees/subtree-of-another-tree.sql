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
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
    if(sameTree(root,subRoot)){
        return true;
    }
    bool left = false;
    if(root->left){
        left = isSubtree(root->left,subRoot);
    }
    bool right = false;
    if(root->right){
        right = isSubtree(root->right,subRoot);
    }
    return left || right; 
       
    }
private:
    bool sameTree(TreeNode* root, TreeNode* subRoot)
    {
        if (!root && !subRoot){
            return true;
        }
        if (!root || !subRoot){
            return false;
        }
        if(root->val == subRoot->val){
            return sameTree(root->left, subRoot->left) &&  sameTree(root->right, subRoot->right);
        }else{
            return false;
        }
    }
};
