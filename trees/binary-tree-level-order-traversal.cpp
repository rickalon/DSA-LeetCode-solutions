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
    vector<vector<int>> levelOrder(TreeNode* root) {
    queue<TreeNode*> q;
    vector<vector<int>> vt;
    if(!root){
        return vt;
    }
    q.push(root);
    while(!q.empty()){
    vector<int> level;
    auto size = q.size();
    for(int iii=0;iii<size;iii++){
    TreeNode* aux = q.front();
        if(aux){
            level.push_back(aux->val);
            q.push(aux->left);
            q.push(aux->right);
        }
    q.pop();
    }
    if(!level.empty())
         vt.push_back(level);
    }
    return vt;

    }
};
