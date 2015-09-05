/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
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
    public void helper(List<String> res, StringBuffer sb, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null) {
            sb.append(String.valueOf(root.val));
            sb.append("->");
            StringBuffer sb1 = new StringBuffer(sb);
            helper(res, sb1, root.left);
            StringBuffer sb2 = new StringBuffer(sb);
            helper(res, sb2, root.right);
        } else if (root.left != null) {
            sb.append(String.valueOf(root.val));
            sb.append("->");
            helper(res, sb, root.left);
        } else if (root.right != null) {
            sb.append(String.valueOf(root.val));
            sb.append("->");
            helper(res, sb, root.right);
        } else {
            sb.append(String.valueOf(root.val));
            res.add(sb.toString());
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        helper(res, sb, root);
        return res;
    }
}
