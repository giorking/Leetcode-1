class Solution {
public:
    bool validTree(int n, vector<pair<int, int>>& edges) {
    	if (edges.size() != n - 1) return false;
    	if (n == 1) return true;
        vector<vector<int> > map(n);
        for (int i = 0; i < edges.size(); i ++) {
        	int x = edges[i].first, y = edges[i].second;
        	map[x].push_back(y);
        	map[y].push_back(x);
        }
        vector<int> bin(n);
     	vector<int> vis(n, 0);
        queue<int> q;
        for (int i = 0; i < n; i ++) {
        	bin[i] = map[i].size();
        	if (map[i].empty()) return false;
        	if (bin[i] == 1) {
        		q.push(i);
        		vis[i] = 1;
        	}
        }
        while (!q.empty()) {
        	int cur = q.front();
        	q.pop();
        	for (int i = 0; i < map[cur].size(); i ++) {
        		int temp = map[cur][i];
        		bin[temp] --;
        		if (vis[temp] == 0 && bin[temp] == 1) {
        			q.push(temp);
        			vis[temp] = 1;
        		}
        	}
        }
        for (int i = 0; i < n; i ++) {
        	if (vis[i] == 0) return false;
        }
        return true;
    }
};
