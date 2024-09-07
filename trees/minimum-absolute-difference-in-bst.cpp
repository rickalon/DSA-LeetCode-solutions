#include <climits>  
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     Tr
 eeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int getMinimumDifference(TreeNode* root) {
        prev = nullptr;
        dif = INT_MAX;
        nodeTraversal(root);
        return dif;
    }
private:
    TreeNode* prev;
    int dif;
    void nodeTraversal(TreeNode* root){
        if(!root){
            return;
        }

        nodeTraversal(root->left);
        if(prev){
            dif = min(dif,abs(root->val - prev->val));
        }
        prev = root;
        nodeTraversal(root->right);

    }
};
