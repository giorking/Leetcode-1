public class Solution {
    public int trap(int[] height) {
        if (height.length <= 0) return 0;
        int index = -1, cur = -1;
        for (int i = 0; i < height.length; i ++) {
            if (height[i] > cur) {
                cur = height[i];
                index = i;
            }
        }
        int res = 0;
        cur = height[0];
        for (int i = 0; i < index; i ++) {
            if (height[i] < cur) res += (cur - height[i]);
            else cur = height[i];
        }
        cur = height[height.length - 1];
        for (int i = height.length - 1; i > index; i --) {
            if (height[i] < cur) res += (cur - height[i]);
            else cur = height[i];
        }
        return res;
    }
}
