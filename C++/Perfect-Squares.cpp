class Solution {
public:
    int numSquares(int n) {
        int cur = sqrt(double(n) + 0.5);
        vector<int> bin(n + 1, 1000);
        bin[0] = 0;
        for (int i = 0; i <= n; i ++) {
        	for (int j = 1; j <= cur; j ++) {
        		int cnt = i + j * j;
        		if (cnt > n) break;
        		if (bin[cnt] > bin[i] + 1) bin[cnt] = bin[i] + 1;
        	}
        }
        return bin[n];
    }
};