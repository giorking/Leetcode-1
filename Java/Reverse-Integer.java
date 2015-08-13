public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = x, cur = 0;
        while (x > 0) {
            cur = cur * 10 + x % 10;
            x = x / 10;
        }
        return num == cur;
    }
}