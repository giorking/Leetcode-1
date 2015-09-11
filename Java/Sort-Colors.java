public class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] != 2) {
                left ++;
            }
            while (left < right && nums[right] == 2 ) {
                right --;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        left = 0;
        while (left < right) {
            while (left < right && nums[left] == 0) {
                left ++;
            }
            while (left < right && nums[right] >= 1) {
                right --;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
    }
}
