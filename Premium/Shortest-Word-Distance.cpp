class Solution {
public:
    int shortestDistance(vector<string>& words, string word1, string word2) {
    	int minlen = INT_MAX, p1 = -1, p2 = -1;
    	for (int i = 0; i < words.size(); i ++) {
    		if (words[i] == word1) {
    			if (p2 != -1) minlen = min(minlen, i - p2);
    			p1 = i;
    		} else if (words[i] == word2) {
    			if (p1 != -1) minlen = min(minlen, i - p1);
    			p2 = i;
    		}
    	}
    	return minlen;
    }
};