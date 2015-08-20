class Solution {
public:
    int minCostII(vector<vector<int> >& costs) {
    	if (costs.empty()) return 0;
    	for (int i = 1; i < costs.size(); i ++) {
    		for (int k = 0; k < costs[i].size(); k ++){
    			int temp = INT_MAX;
    			for (int j = 0; j < costs[i].size(); j ++) {
    				if(j != k) temp = min(temp, costs[i - 1][j]);
    			}
    			costs[i][k] = temp + costs[i][k];
    		}
    	}
    	int res = INT_MAX;
    	for (int i = 0; i < costs[0].size(); i ++) {
    		res = min(res, costs[costs.size() - 1][i]);
    	}
        return res;
    }
};