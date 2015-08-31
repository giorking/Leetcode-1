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
	void helper(TreeNode* root, priority_queue<pair<double, int> >& pq, double target, int k) {
		if(!root) return;

    	pq.push(make_pair(fabs(target - double(root->val)), root->val));

    	if(pq.size() > k) 
        	pq.pop();
        helper(root->left, pq, target, k);
        helper(root->right, pq, target, k);
	}
    vector<int> closestKValues(TreeNode* root, double target, int k) {
    	priority_queue<pair<double, int> > pq;
    	vector<int> result;
    	helper(root, pq, target, k);
    	while (!pq.empty()) {
    		result.push_back(pq.top().second);
    		pq.pop();
    	}
    	return result;
    }
};