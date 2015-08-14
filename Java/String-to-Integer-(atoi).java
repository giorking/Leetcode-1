public class Solution {
    public int myAtoi(String str) {
        int cur = 0, index = 0, sign = 1;
        while (index < str.length() && str.charAt(index) == ' ') index ++;
        if (index == str.length()) return 0;
        if (str.charAt(index) == '-') {
            index ++;
            sign = -1;
        } else if (str.charAt(index) == '+'){
            index ++;
        }
        for (; index < str.length(); index ++) {
            char temp = str.charAt(index);
            if (temp > '9' || temp < '0') break;
            if (sign == 1 && (cur > Integer.MAX_VALUE / 10 ||
                    (cur == Integer.MAX_VALUE / 10 && temp >= '7'))) return Integer.MAX_VALUE;
            if (sign == -1 && (cur > Integer.MAX_VALUE / 10 ||
                    (cur == Integer.MAX_VALUE / 10 && temp >= '8'))) return Integer.MIN_VALUE;
            cur = cur * 10 + temp - '0';
        }
        return cur * sign;
    }
}
