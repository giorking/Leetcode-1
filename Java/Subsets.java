public class Solution {
    public void helper(List<List<Integer>> res, int[] nums, ArrayList<Integer> cur, int pos) {
        res.add(new ArrayList<Integer>(cur));
        for (int i = pos; i < nums.length; i ++) {
            cur.add(nums[i]);
            helper(res, nums, cur, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        helper(res, nums, cur, 0);
        return res;
    }
}