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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        dfs(ans,0,root);
        return ans;
    }
    public void dfs(List<Integer> ans,int lvl,TreeNode root){
        if(root==null){
            return;
        }
        if(ans.size()==lvl){
            ans.add(root.val);
        }
        dfs(ans,lvl+1,root.right);
        dfs(ans,lvl+1,root.left);
    }
}
