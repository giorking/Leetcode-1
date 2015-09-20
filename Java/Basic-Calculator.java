public class Solution {
    public int helper(int x, int y, char ch) {
        if (ch == '+') return x + y;
        return y - x;
    }
    public void solve(Stack<Integer> IntStk, Stack<Character> OpStk) {
        int x = IntStk.pop(), y = IntStk.pop();
        char ch = OpStk.pop();
        IntStk.push(helper(x, y, ch));
    }
    public int calculate(String s) {
        Stack<Character> OpStk = new Stack<Character>();
        Stack<Integer> IntStk = new Stack<Integer>();
        int flag = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i ++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
                flag = 1;
            } else {
                if (flag == 1) IntStk.push(Integer.parseInt(sb.toString()));                                    
                flag = 0;
                sb = new StringBuffer();
                if (s.charAt(i) == '(') {
                    OpStk.push('(');
                } else if (s.charAt(i) == ')') {
                    while (OpStk.peek() != '(') {
                        solve(IntStk, OpStk);
                    }
                    OpStk.pop();
                } else if (s.charAt(i) != ' ') {
                    while (!OpStk.isEmpty() && OpStk.peek() != '(') {
                        solve(IntStk, OpStk);
                    }
                    OpStk.push(s.charAt(i));
                }
            }
        }
        if (flag == 1) {
            IntStk.push(Integer.parseInt(sb.toString()));
        }
        while (!OpStk.isEmpty()) {
            solve(IntStk, OpStk);
        }
        return IntStk.peek();
    }
}