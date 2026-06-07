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
    public int maxPathSum(TreeNode root) {
        int[] dp=new int[]{root.val};
        dfs(root,dp);
        return dp[0];
    }
    public int dfs(TreeNode root,int[] dp){
        if(root==null){
            return 0;
        }
        int left=Math.max(dfs(root.left,dp),0);
        int right=Math.max(dfs(root.right,dp),0);
        dp[0]=Math.max(dp[0],left+right+root.val);
        return root.val+Math.max(left,right);
    }
}
