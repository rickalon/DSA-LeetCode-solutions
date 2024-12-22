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
    static TreeNode* buildTreeImpl(std::span<int> preorder, std::span<int> inorder) {
        assert(preorder.size() == inorder.size() && "They must be equal");
        if (preorder.empty()) {
            return nullptr;
        }

        const int rootVal =  preorder.front();

        if (preorder.size() == 1) {
            return new TreeNode(rootVal);
        }

        const size_t idxInInorder = 
            std::distance(inorder.begin(), 
                          std::find(inorder.begin(), inorder.end(), rootVal));        

        TreeNode *root = new TreeNode(rootVal);
        root->left = buildTreeImpl(preorder.subspan(1, idxInInorder), 
                                   inorder.subspan(0, idxInInorder));
        root->right = buildTreeImpl(
                            preorder.subspan(idxInInorder+1, preorder.size() - (idxInInorder+1)), 
                            inorder.subspan(idxInInorder+1, inorder.size() - (idxInInorder+1)));

        return root;
    }

public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        return buildTreeImpl(preorder, inorder);
    }
};
