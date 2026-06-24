class Solution {
    int[] parent;
    int[] rank;
    public int[] findRedundantConnection(int[][] edges) {
      parent=new int[edges.length+1];
      rank=new int[edges.length+1];
      for(int i=0;i<rank.length;i++){
        parent[i]=i;
        rank[i]=1;
      }
      for(int[] e:edges){
        int u=e[0];
        int v=e[1];
        if(!union(u,v)){
            return new int[]{u,v};
        }
      }   
      return new int[0];
    }
    public int find(int[] par,int node){
       while(node!=par[node]){
         par[node]=par[par[node]];
         node=par[node];
       }
       return  node;
    }
    public boolean union(int u,int v){
        int pu=find(parent,u);
        int pv=find(parent,v);
        if(pu==pv)return false;
        if(rank[pu]>rank[pv]){
            parent[pv]=pu;
        }
        else if(rank[pu]<rank[pv]){
            parent[pu]=pv;
        }else{
            parent[pv]=pu;
            rank[pu]++;
        }
        return true;
    }
}
