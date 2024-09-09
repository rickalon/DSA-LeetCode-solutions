/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        if(!root){
            return nullptr;
        }
        TreeNode* left = lowestCommonAncestor(root->left,p,q);
        TreeNode* right = lowestCommonAncestor(root->right,p,q);

        if(!left && !right){
            if(root->val == q->val)
                return q;
            else if(root->val == p->val)
                return p;
            else
                return nullptr;
        }else if(left && right && ((left->val == p->val && right ->val == q->val) || (right->val == p->val && left->val == q->val))){
            return root;
        }else if((left && left->val == p->val) || (right && right ->val == p->val)){
            if(root->val == q ->val){
                return root;
            }else{
                return p;
            }
        }else if((left && left->val == q->val) || (right && right ->val == q->val)){
            if(root->val == p ->val){
                return root;
            }else{
                return q;
            }
        }else{
            if(left){
                return left;
            }else{
                return right;
            }
        }
    }    
};
