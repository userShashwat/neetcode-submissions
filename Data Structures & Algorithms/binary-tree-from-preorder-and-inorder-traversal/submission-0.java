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
    int inIdx=0;
    int prIdx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,Integer.MAX_VALUE);
    }
    public TreeNode helper(int[] p,int [] i,int limit){
        if(prIdx>=p.length){
            return null;
        }
        if(i[inIdx]==limit){
            inIdx++;
            return null;
        }
        TreeNode root=new TreeNode(p[prIdx++]);
        root.left=helper(p,i,root.val);
        root.right=helper(p,i,limit);
        return root;
    }
}
