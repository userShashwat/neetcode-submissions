class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,temp,ans,0);
        return ans;
    }
    public void dfs(int[] nums,List<Integer> t,List<List<Integer>> ans,int i){
        if(i<=nums.length){
            ans.add(new ArrayList<>(t));
            if(i==nums.length)return ;
        }
        for(int ind=i;ind<nums.length;ind++){
            if(ind>i && nums[ind]==nums[ind-1]){
                continue; 
            }
            t.add(nums[ind]);
            dfs(nums,t,ans,ind+1);
            t.remove(t.size()-1);
        }
    }
}
