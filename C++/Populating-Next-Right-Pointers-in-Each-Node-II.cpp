/**
 * Definition for binary tree with next pointer.
 * struct TreeLinkNode {
 *  int val;
 *  TreeLinkNode *left, *right, *next;
 *  TreeLinkNode(int x) : val(x), left(NULL), right(NULL), next(NULL) {}
 * };
 */

class Solution {
public:
    void connect(TreeLinkNode *root) {        
    }
};

class Solution {
public:
    void connect(TreeLinkNode *root) {
        if (root == NULL) return;
        queue<TreeLinkNode*> q;
        q.push(root);
        while (!q.empty()) {
            int size = q.size();
            TreeLinkNode* prev = NULL;
            for (int i = 0; i < size; i ++) {
                TreeLinkNode* cur = q.front();
                q.pop();
                cur->next = prev;
                prev = cur;
                if (cur->right != NULL) q.push(cur->right);
                if (cur->left != NULL) q.push(cur->left);
            }
        }
    }
};