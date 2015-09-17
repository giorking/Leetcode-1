public class Solution {
    public int numSquares(int n) {
        int cur = (int)Math.sqrt((double)n + 0.5);
        int[]dp = new int[n + 1];
        Arrays.fill(dp, 1000);
        dp[0] = 0;
        for (int i = 0; i <= n; i ++) {
            for (int j = 1; j <= cur; j ++) {
                int cnt = j * j + i;
                if (cnt > n) break;
                if (dp[cnt] > dp[i] + 1) dp[cnt] = dp[i] + 1;
            }
        }
        return dp[n];
    }
}