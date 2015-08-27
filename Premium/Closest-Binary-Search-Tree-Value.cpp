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
    int closestValue(TreeNode* root, double target) {
        int cur = root->val;
        auto kid = target < cur ? root->left : root->right;
        if (kid == NULL) return cur;
        int res = closestValue(kid, target);
        return abs(cur - target) < abs(res - target) ? cur : res;
    }
};