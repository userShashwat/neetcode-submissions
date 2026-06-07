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

public class Codec {

    
    public String serialize(TreeNode root) {
        List<String> res=new ArrayList<>();
        dfs1(root,res);
        return String.join(",",res);
    }
    public void dfs1(TreeNode root,List<String> lst){
        if(root==null){
            lst.add("N");
            return ;
        }

        lst.add(String.valueOf(root.val));
        dfs1(root.left,lst);
        dfs1(root.right,lst);
    }
    public TreeNode deserialize(String data) {
        String[] vals=data.split(",");
        int[] i={0};
        return dfs2(vals,i);
    }
    public TreeNode dfs2(String[] st,int[] i){
        if(st[i[0]].equals("N")){
            i[0]++;
            return null;
        }
        TreeNode root=new 
        TreeNode(Integer.parseInt(st[i[0]]));
        i[0]++;
        root.left=dfs2(st,i);
        root.right=dfs2(st,i);
        return root;
    }
}
