class Solution {
public:
    int minCost(vector<vector<int> >& costs) {
    	if (costs.empty()) return 0;
        int minc = INT_MAX;
        int x = costs[0][0], y = costs[0][1], z = costs[0][2];
        for (int i = 1; i < costs.size(); i ++) {
        	int x1 = min(y, z) + costs[i][0];
        	int y1 = min(x, z) + costs[i][1];
        	int z1 = min(x, y) + costs[i][2];
        	x = x1;
        	y = y1;
        	z = z1;
        }
        return min(x, min(y, z));
    }
};