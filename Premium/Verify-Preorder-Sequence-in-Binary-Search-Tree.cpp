class Solution {
public:
    bool verifyPreorder(vector<int>& preorder) {
        int low = INT_MIN, i = -1;
        for (int k = 0; k < preorder.size(); k ++) {
        	if (preorder[k] < low) {
        		return false;
        	}
        	while (i >= 0 && preorder[k] > preorder[i]) {
        		low = preorder[i --];
        	}
        	preorder[++ i] = preorder[k];
        }
        return true;
    }
};