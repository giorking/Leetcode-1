public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i ++) {
            if (!Character.isDigit(input.charAt(i))) {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int j = 0; j < left.size(); j ++) {
                    for (int k = 0; k < right.size(); k ++) {
                        char ch = input.charAt(i);
                        if (ch == '+') res.add(left.get(j) + right.get(k));
                        else if (ch == '-') res.add(left.get(j) - right.get(k));
                        else res.add(left.get(j) * right.get(k));
                    }
                }
            }
        }
        if (res.isEmpty()) res.add(Integer.parseInt(input));
        return res;
    }
}