public class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        for (int i = 0; i + len2 - 1 < len1; i ++) {
            int vis = 1;
            for (int j = 0; j < len2; j ++) {
                if (haystack.charAt(j + i) != needle.charAt(j)) {
                    vis = 0;
                    break;
                }
            }
            if (vis == 1) {
                return i;
            }
        }
        return -1;
    }
}
