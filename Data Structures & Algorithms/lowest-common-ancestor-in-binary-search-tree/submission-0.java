/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            // If both nodes are smaller than root, LCA lies in left
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            // If both nodes are greater than root, LCA lies in right
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            // Split point found (one on left, one on right or equal to root)
            else {
                return root;
            }
        }
        return null; // In case inputs are invalid or tree is empty
    }
}
