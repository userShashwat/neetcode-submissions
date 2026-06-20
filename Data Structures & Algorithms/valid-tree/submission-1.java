class Solution {
    public boolean validTree(int n, int[][] edges) {
         List<List<Integer>> adj=new ArrayList<>();
         for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
         }
         for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
         }
         int[] vis=new int[n];
         if(!dfs(adj,0,-1,vis)){
            return false;
         }
         for( int i: vis){
            if(i==0)return false;
         }
         return true;

    }
    public boolean dfs(List<List<Integer>> adj,int i,int parent,int[] vis){
        vis[i]=1;
        for(int j : adj.get(i)){
            if(j==parent){
                continue;
            }
            if(vis[j]==1)return false;
            if (!dfs(adj, j, i, vis)) {
                return false;
            }
        }
        return true;
    }
}
