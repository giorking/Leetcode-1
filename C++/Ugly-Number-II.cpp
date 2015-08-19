class Solution {
public:
    int nthUglyNumber(int n) {
        int i2 = 0, i3 = 0, i5 = 0;
        vector<int> arr(n + 1);
        arr[0] = 1;
        for (int i = 1; i < n; i ++) {
        	int cur2 = arr[i2] * 2, cur3 = arr[i3] * 3, cur5 = arr[i5] * 5;
        	arr[i] = min(cur2, min(cur3, cur5));
        	if (arr[i] == cur2) i2 ++;
        	if (arr[i] == cur3) i3 ++;
        	if (arr[i] == cur5) i5 ++;
        }
        return arr[n - 1];
    }
};