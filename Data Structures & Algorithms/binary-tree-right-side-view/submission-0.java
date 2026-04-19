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
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode nodeR=null;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node=q.remove();
                if(node!=null){
                    nodeR=node;
                    if(node.left!=null)q.add(node.left);
                    if(node.right!=null)q.add(node.right);
                }
            }
            if(nodeR!=null)
            ans.add(nodeR.val);
        }
        return ans;

    }
}
