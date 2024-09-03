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
    bool isSymmetric(TreeNode* root) {
        if(!root)
            return true;
        return symetricCore(root->left,root->right);
    }
private:
    bool symetricCore(TreeNode* one, TreeNode* two)
    {
        if(one && two){
            if(one ->val == two ->val){
                return symetricCore(one->left,two->right) && symetricCore(one->right,two->left);
            }else{
                return false;
            }
        }else{
            if(!one && !two){
                return true;
            }else{
                return false;
            }
        }
    }
};
