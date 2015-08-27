public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int res = 0, cur = prices[0];
        for (int i = 1; i < prices.length; i ++) {
            res = Math.max(res, prices[i] - cur);
            cur = Math.min(cur, prices[i]);
        }
        return res;
    }
}