public class Solution {
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }
        long d1 = Math.abs((long)dividend);
        long d2 = Math.abs((long)divisor);
        long res = 0;
        while (d1 >= d2) {
            long temp = d2;
            long cur = 1;
            while ((temp << 1) < d1) {
                cur = cur << 1;
                temp = temp << 1;
            }
            d1 = d1 - temp;
            res += cur;
            if (sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return (int)(res * sign);
    }
}