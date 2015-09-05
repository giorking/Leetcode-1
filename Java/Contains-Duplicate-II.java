public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k <= 0 || nums.length <= 0) return false;
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i <= k && i < nums.length; i ++) {
            if (hash.contains(nums[i])) return true;
            hash.add(nums[i]);
        }
        for (int i = k + 1; i < nums.length; i ++) {
            hash.remove(nums[i - k - 1]);
            if (hash.contains(nums[i])) return true;
            hash.add(nums[i]);
        }
        return false;
    }
}