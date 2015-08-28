public class Solution {
    boolean next_permutation(ArrayList<Integer> cur) {
        if (cur.size() <= 1) return false;
        int i1 = cur.size() - 1, i = i1 - 1;
        while (i >= 0 && cur.get(i) >= cur.get(i1)) {
            i --;
            i1 --;
        }
        if (i < 0) return false;
        int i2 = cur.size() - 1;
        while (i2 >= 0 && cur.get(i2) <= cur.get(i)) {
            i2 --;
        }
        int temp = cur.get(i);
        cur.set(i, cur.get(i2));
        cur.set(i2, temp);
        int left = i1, right = cur.size() - 1;
        while (left < right) {
            temp = cur.get(left);
            cur.set(left, cur.get(right));
            cur.set(right, temp);
            left ++;
            right --;
        }
        return true;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer> cur = new ArrayList<Integer>();
        for (int i : nums) {
            cur.add(i);
        }
        Collections.sort(cur);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>(cur));
        while (next_permutation(cur)) {
            res.add(new ArrayList<Integer>(cur));
        }
        return res;
    }
}