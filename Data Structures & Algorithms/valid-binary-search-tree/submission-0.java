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
    boolean flag=true;
     long preval=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        dfs(root);
        return flag;
    }
    public void dfs(TreeNode root){
        if(root==null)return;
        dfs(root.left);
        if(preval>=root.val)flag=false;
        preval=root.val;
        dfs(root.right);
    }

}
