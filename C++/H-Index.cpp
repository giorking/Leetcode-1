class Solution {
public:
    int hIndex(vector<int>& citations) {
        sort(citations.begin(), citations.end());
        int res = 0, len = citations.size();
        for (int i = 0; i < len; i ++) {
        	res = max(res, min(citations[i], len - i));
        }
        return res;
    }
};