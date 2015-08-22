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
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                TreeNode temp = root.right;
                root.right = root.left;
                root.left = null;
                TreeNode cur = root;
                while (cur.right != null) {
                    cur = cur.right;
                }
                cur.right = temp;
            }
            root = root.right;
        }
    }
}
