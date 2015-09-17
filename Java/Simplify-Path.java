public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<String>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= path.length(); i ++) {
            if (i == path.length() || path.charAt(i) == '/') {
                if (sb.toString().equals("..")) {
                    if (!stk.isEmpty()) stk.pop();
                } else if (!(sb.toString().equals(".")) && sb.length() != 0) {
                    stk.push(sb.toString());
                }
                sb = new StringBuffer();
            } else {
                sb.append(path.charAt(i));
            }
        }
        if (stk.isEmpty()) return "/";
        for (int i = 0; i < stk.size(); i ++) {
            sb.append("/");
            sb.append(stk.get(i));
        }
        return sb.toString();
    }
}