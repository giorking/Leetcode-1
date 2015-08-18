public class Solution {
	public boolean hash_permutation(int[] nums) {
        int i = nums.length - 1, i1 = i - 1, i2 = i;
        while (i1 >= 0 && nums[i1] >= nums[i]) {
            i--;
            i1--;
        }
        if (i1 < 0) return false;
        while (i2 >= 0 && nums[i2] <= nums[i1]) {
            i2 --;
        }
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
        int left = i, right = nums.length - 1;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left ++;
            right --;
        }
        return true;
    }
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        if (hash_permutation(nums)) return;
        Arrays.sort(nums);
        return;
    }
}