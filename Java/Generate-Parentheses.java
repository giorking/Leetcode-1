public class Solution {
    public void helper(List<String> res, StringBuffer cur, int lpos, int rpos, int n) {
        if (lpos == n) {
            StringBuffer temp = new StringBuffer(cur);
            for (int i = rpos + 1; i <= n; i ++) {
                temp.append(')');
            }
            res.add(temp.toString());
            return;
        }
        if (lpos > rpos) {
            StringBuffer temp = new StringBuffer(cur);
            temp.append(')');
            helper(res, temp, lpos, rpos + 1, n);
        }
        StringBuffer temp = new StringBuffer(cur);
        temp.append('(');
        helper(res, temp, lpos + 1, rpos, n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        StringBuffer cur = new StringBuffer();
        helper(res, cur, 0, 0, n);
        return res;
    }
}