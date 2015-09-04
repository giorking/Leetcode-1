class Solution {
public:
    int addDigits(int num) {
        while (num >= 10) {
            int res = 0, cnt = num;
            while (cnt != 0) {
                res += cnt % 10;
                cnt = cnt / 10;
            }
            num = res;
        }
        return num;
    }
};