/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int closestValue(TreeNode root, double target) {
        int cur = root.val;
        TreeNode cnt = target < cur ? root.left : root.right;
        if (cnt == null) return cur;
        int res = closestValue(cnt, target);
        return Math.abs(res - target) < Math.abs(cur - target) ? res : cur;
    }
}