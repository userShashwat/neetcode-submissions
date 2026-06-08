class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(nums,target,ans,temp,0);
        return ans;
    }
    public void solve(int[] n,int t,List<List<Integer>> ans,List<Integer> temp,int ind){
        if(t==0){
            ans.add(new ArrayList<>(temp)); 
            return ;
        }
        if( t<0|| ind==n.length){
            return ;
        }
        temp.add(n[ind]);
        solve(n,t-n[ind],ans,temp,ind);
        temp.remove(temp.size()-1);
        solve(n,t,ans,temp,ind+1);
    }
    
}
