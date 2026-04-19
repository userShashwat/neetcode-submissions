class Solution {
    public boolean validTree(int n, int[][] edges) {
       if(edges.length>n-1){
        return false;
       }
       List<List<Integer>> adj=new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }
       for(int[] edge:edges){
        adj.get(edge[0]).add(edge[1]);
        adj.get(edge[1]).add(edge[0]);
       }
       Set<Integer> vis=new HashSet<>();
       if(!dfs(0,-1,vis,adj)){
        return false;
       }
       return vis.size()==n;
    }
    public boolean dfs(int node,int parent,Set<Integer> vis,List<List<Integer>> adj){
        if(vis.contains(node)){
            return false;
        }
        vis.add(node);
        for(int ngh : adj.get(node)){
            if(ngh==parent)continue;
            if(!dfs(ngh,node,vis,adj)){
                return false;
            }
        }
        return true;
    }
}
