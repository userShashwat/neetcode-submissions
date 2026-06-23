class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] vis=new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(vis,adj,i);
                cnt++;
            }
        }
        return cnt;
    }
    public void dfs(int[] vis,List<List<Integer>> adj,int i){
        vis[i]=1;
        for(int node:adj.get(i)){
            if(vis[node]==0){
                dfs(vis,adj,node);
            }
        }
    } 
}
