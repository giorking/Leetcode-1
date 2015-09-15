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
    public boolean helper(TreeNode cur1, TreeNode cur2) {
        if (cur1 == null && cur2 == null) return true;
        else if (cur1 == null || cur2 == null) return false;
        else {
            if (cur1.val != cur2.val) return false;
            if (helper(cur1.left, cur2.right) && helper(cur1.right, cur2.left)) return true;
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
    }
}