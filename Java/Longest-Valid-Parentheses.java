public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<Integer>();
        int pre = -1, maxlen = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(') {
                stk.push(i);
            } else {
                if (stk.isEmpty()) {
                    pre = i;
                } else {
                    stk.pop();
                    if (stk.isEmpty()) maxlen = Math.max(maxlen, i - pre);
                    else maxlen = Math.max(maxlen, i - stk.peek());
                }
            }
        }
        return maxlen;
    }
}
