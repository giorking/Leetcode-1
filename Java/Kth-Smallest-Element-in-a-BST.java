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
    public int countNode(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNode(root.left) + countNode(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        int num = countNode(root.left);
        if (k <= num) {
            return kthSmallest(root.left, k);
        } else if (k > num + 1) {
            return kthSmallest(root.right, k - 1 - num);
        }
        return root.val;
    }
}