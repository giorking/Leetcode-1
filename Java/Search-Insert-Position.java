public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) right = mid;
            else left = mid;
        }
        if (nums[left] >= target) return left;
        else if (nums[right] >= target) return right;
        return nums.length;
    }
}