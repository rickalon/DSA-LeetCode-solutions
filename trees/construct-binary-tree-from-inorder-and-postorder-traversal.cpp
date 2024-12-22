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
    static TreeNode* buildTreeImpl(std::span<int> inorder, std::span<int> postorden) {
        assert(inorder.size() == postorden.size() && "They must be equal");
        if (inorder.empty()) {
            return nullptr;
        }

        const int rootVal = postorden.back();

        if (inorder.size() == 1) {
            return new TreeNode(rootVal);
        }

        const size_t idxInInorder = 
            std::distance(inorder.begin(), 
                          std::find(inorder.begin(), inorder.end(), rootVal));        

        TreeNode *root = new TreeNode(rootVal);
        root->left = buildTreeImpl(inorder.subspan(0, idxInInorder), 
                                   postorden.subspan(0, idxInInorder));
        root->right = buildTreeImpl(
                            inorder.subspan(idxInInorder+1, inorder.size() - (idxInInorder+1)), 
                            postorden.subspan(idxInInorder, (postorden.size() - 1) - idxInInorder));

        return root;
    }

public:
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorden) {
        return buildTreeImpl(inorder, postorden);
    }
};
