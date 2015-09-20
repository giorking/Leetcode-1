public class Solution {
    public int numDistinct(String s, String t) {
        int lens = s.length(), lent = t.length();
        if (lens == 0 || lent == 0) return 0;
        int[][] arr = new int[lens + 1][lent + 1];
        for (int i = 0; i <= lens; i ++) {
            for (int j = 0; j <= lent; j ++) {
                if (i < j) arr[i][j] = 0;
                else if (i == 0 || j == 0) arr[i][j] = 1;
                else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        return arr[lens][lent];
    }
}