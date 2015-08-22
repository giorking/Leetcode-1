public class Solution {
    public void helper(List<List<Integer>> res, List<Integer> cur, int[] candidates, int target, int pos) {
        if (target == 0) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        int vis = -1, pre = -1;
        for (int i = pos; i < candidates.length; i ++) {
            if (target < candidates[i]) break;
            if (vis == 1 && pre == candidates[i]) continue;
            vis = 1;
            pre = candidates[i];
            cur.add(candidates[i]);
            helper(res, cur, candidates, target - candidates[i], i + 1);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(res, cur, candidates, target, 0);
        return res;
    }
}