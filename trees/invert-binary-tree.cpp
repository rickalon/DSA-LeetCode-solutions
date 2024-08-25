class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
    if(!root)
        return nullptr;
    queue<TreeNode*> q;
    q.push(root);
    while(!q.empty()){
        TreeNode* trav = q.front();
        q.pop();
        TreeNode* aux = trav -> left;
        trav -> left = trav -> right;
        trav -> right = aux;
        if(trav->left)
             q.push(trav->left);
        if(trav->right)
             q.push(trav->right);
    }
    return root;    
    }
};
