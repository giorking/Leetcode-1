public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] cur = new int[len1 + len2];
        for (int i = 0; i < num1.length(); i ++) {
            for (int j = 0; j < num2.length(); j ++) {
                cur[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        for (int i = 0; i < len1 + len2; i ++) {
            int j = len1 + len2 - i - 1;
            if (cur[j] >= 10) {
                cur[j - 1] += cur[j] / 10;
                cur[j] = cur[j] % 10;
            }
        }
        int r = 0;
        while (r < len1 + len2 && cur[r] == 0) r ++;
        if (r >= len1 + len2) return "0";
        StringBuffer sb = new StringBuffer();
        for (int i = r; i < len1 + len2; i ++) {
            sb.append(String.valueOf(cur[i]));
        }
        return sb.toString();
    }
}