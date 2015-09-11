public class Solution {
    public double helper(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n % 2 == 0) {
            double cur = helper(x, n / 2);
            return cur * cur;
        } else {
            double cur = helper(x, n / 2);
            return cur * cur * x;
        }
    }
    public double myPow(double x, int n) {
        if (n >= 0) {
            return helper(x, n);
        } else {
            return 1.0 / helper(x, -n);
        }
    }
}
