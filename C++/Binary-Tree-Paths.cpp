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
	void helper(vector<string>& res, TreeNode* root, string str) {
		if (root == NULL) {
			res.push_back(str);
			return;
		}
		str = str + "->" + to_string(root->val);
		if (root->left == NULL && root->right == NULL) {
        	res.push_back(str);
        	return;
        }
		if (root->left != NULL) helper(res, root->left, str);
        if (root->right != NULL) helper(res, root->right, str);
	}
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> res;
        if (root == NULL) return res;
        string str = to_string(root->val);
        if (root->left == NULL && root->right == NULL) {
        	res.push_back(str);
        	return res;
        }
        if (root->left != NULL) helper(res, root->left, str);
        if (root->right != NULL) helper(res, root->right, str);
        return res;
    }
};