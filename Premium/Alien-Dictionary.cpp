class Solution {
public:
    string alienOrder(vector<string>& words) {
    	if (words.empty()) return "";
        vector<vector<int> > edgemap(26);
        vector<int> vis(26, 0), appeared(26, 0);
        for (int i = 0; i < words.size(); i ++) {
        	for (int j = 0; j < words[i].size(); j ++) {
        		appeared[words[i][j] - 'a'] ++;
        	}
        }
        string prev = words[0];
        for (int i = 1; i < words.size(); i ++) {
        	if (words[i] == words[i - 1]) continue;
        	int j = 0;
        	for (j = 0; j < prev.size() && j < words[i].size(); j ++) {
        		if (prev[j] != words[i][j]) break;
        	}
        	if (j == prev.size() || j == words[i].size()) continue;
        	int cur1 = prev[j] - 'a', cur2 = words[i][j] - 'a';
        	edgemap[cur1].push_back(cur2);
        	vis[cur2] ++;
        	prev = words[i];
        }
        queue<int> q;
        string res = "";
        for (int i = 0; i < 26; i ++) {
        	if (vis[i] == 0 && appeared[i] != 0) {
        		q.push(i);
        	}
        }
        while (!q.empty()) {
        	int cnt = q.front();
            char cur = cnt + 'a';
            res += cur;
            q.pop();
            for (int i = 0; i < edgemap[cnt].size(); i ++) {
            	int temp = edgemap[cnt][i];
            	if (vis[temp] > 0) {
            		vis[temp] --;
            		if (vis[temp] == 0) {
            			q.push(temp);
            		}
            	}
            }
        }
        for (int i = 0; i < 26; i ++) {
        	if (vis[i] != 0) return "";
        }
        return res;
    }
};