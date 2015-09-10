public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0, cur = 1;
        for (int i = 0; i < 32; i ++) {
            cur = 1 << i;
            if ((cur & n) != 0) {
                res = res ^ (1  << (31 - i));
            }
        }
        return res;
    }
}