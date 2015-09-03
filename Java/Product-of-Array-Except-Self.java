public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i ++) {
            res[i] = 1;
        }
        for (int i = 1; i < len; i ++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int cur = 1;
        for (int i = len - 2; i >= 0; i --) {
            cur = cur * nums[i + 1];
            res[i] = res[i] * cur;
        }
        return res;
    }
}