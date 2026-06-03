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
    public boolean isValidBST(TreeNode root) {
        //boolean flag=true;
        return dfs(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        //return flag;
    }
    public boolean dfs(TreeNode root,int l,int r){
           if(root==null){
             return true;
           }
           if(!(root.val>l && root.val<r)){
            return false;
           }
           return dfs(root.left,l,root.val)
           && dfs(root.right,root.val,r);
    }
}
