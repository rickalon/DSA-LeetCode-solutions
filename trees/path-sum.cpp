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
    bool hasPathSum(TreeNode* root, int targetSum) {
        return pathCore(root,targetSum,0);
    }

private:
    bool pathCore(TreeNode* root, int targetSum,int sum){
        if(!root){
            return false;
        }
        sum += root->val;
        if(!root->left && !root->right){
            if(targetSum == sum){
                return true;
            }else{
                return false;
            }
        }
        return pathCore(root->left,targetSum,sum) || pathCore(root->right,targetSum,sum);
    }
};
