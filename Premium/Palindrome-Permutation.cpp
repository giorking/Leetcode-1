class Solution {
public:
    bool canPermutePalindrome(string s) {
        vector<int> vis(256, 0);
        for (int i = 0; i < s.size(); i++) {
        	vis[s[i]] ++;
        }
        int res = 0;
        for (int i = 0; i < 256;i ++) {
        	if (vis[i] % 2 != 0) res ++;
        }
        if ((s.size() % 2 == 0 && res == 0) || (s.size() % 2== 1 && res == 1)) return true;
        return false;
    }
};