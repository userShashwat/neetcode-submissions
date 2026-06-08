class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(ans,temp,0,nums);
        return ans;
    }
    public void solve(List<List<Integer>> ans,List<Integer> temp,int ind,int[] nums){
        if(ind==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        int a=nums[ind];
        temp.add(a);
        solve(ans,temp,ind+1,nums);
        temp.remove(temp.size()-1);
        solve(ans,temp,ind+1,nums);
    }
}
