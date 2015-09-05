public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int [0];
        }
        int len = nums.length;
        int[] r = new int[len - k + 1];
        int cur = 0;
        Deque<Integer> q = new ArrayDeque<Integer>();
        for (int i = 0; i < len; i ++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) {
                r[cur++] = nums[q.peek()];
            }
        }
        return r;
    }
}
