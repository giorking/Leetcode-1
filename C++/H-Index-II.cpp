class Solution {
public:
    int hIndex(vector<int>& citations) {
    	if (citations.empty()) return 0;
        int left = 0, right = citations.size() - 1, len = citations.size();
        while (left + 1 < right) {
        	int mid = left + (right - left) / 2;
        	if (citations[mid] >= len - mid) {
        		right = mid;
        	} else {
        		left = mid;
        	}
        }
        if (citations[left] >= len - left) return len - left;
        else if (citations[right] >= len - right) return len - right;
        return 0;
    }
};