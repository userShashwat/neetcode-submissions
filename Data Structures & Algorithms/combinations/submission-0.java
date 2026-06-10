class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> t=new ArrayList<>();
        dfs(ans,t,1,n,k);
        return ans;
    }
    public void dfs(List<List<Integer>> ans,List<Integer> t,
                    int i,int n,int k){
        if(t.size()==k){
            ans.add(new ArrayList<>(t));
            return;
        }
        for(int j=i;j<=n;j++){
            t.add(j);
            dfs(ans,t,j+1,n,k);
            t.remove(t.size()-1);
        }
    }
}