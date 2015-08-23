class Solution {
public:
	bool isPalindromes(string &s) {
		int left = 0, right = s.size() - 1;
		while (left < right) {
			if (s[left++] != s[right--]) return false;
		}
		return true;
	}
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
    vector<string> generatePalindromes(string s) {
        vector<string> res;
        if (!canPermutePalindrome(s)) return res;
        sort(s.begin(), s.end());
        if (isPalindromes(s)) res.push_back(s);
        while (next_permutation(s.begin(), s.end())) {
        	if (isPalindromes(s)) res.push_back(s);
        }
        return res;
    }
};