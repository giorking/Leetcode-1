public class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int helper(int[] nums, int k, int left, int right) {
        if (left == right) return nums[left];
        int start = left + 1, end = right;
        int temp = nums[left];
        while (start <= end) {
            while (start <= end && nums[start] < temp) {
                start ++;
            }
            while (start <= end && nums[end] >= temp) {
                end --;
            }
            if (start < end) {
                swap(nums, start, end);
            }
        }
        swap(nums, left, end);
        if (end - left + 1 == k) return nums[end];
        else if (end - left + 1 > k) return helper(nums, k, left, end - 1);
        else return helper(nums, k - (end - left + 1), end + 1, right);
    }
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        return helper(nums, len - k + 1, 0, len - 1);
    }
}