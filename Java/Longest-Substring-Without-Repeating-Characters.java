public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int[] vis = new int[256];
        int maxlen = 0, cur = 0;
        for (int i = 0; i < s.length(); i ++) {
            char ch = s.charAt(i);
            vis[ch] ++;
            while (vis[ch] > 1) {
                vis[s.charAt(cur)] --;
                cur ++;
            }
            maxlen = Math.max(maxlen, i - cur + 1);
        }
        return maxlen;
    }
}