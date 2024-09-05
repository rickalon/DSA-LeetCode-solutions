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
    int kthSmallest(TreeNode* root, int k) {
        int index = 0;
        return core(root,k,&index);
    
    }
private:
    int core(TreeNode* root, int k, int* index) {
        if(!root)
            return 0;
        int left=core(root->left,k,index);
        *index += 1;
        if(*index == k)
            return root->val;        
        cout << root -> val << ' ' << *index << endl;
        int right = core(root->right,k,index);
        return max(left,right);
        
        }
};
