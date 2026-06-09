class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(ans,new ArrayList<>(),nums,new boolean[nums.length]);
        return ans;
    }
    public void dfs(List<List<Integer>> ans,List<Integer> temp
    ,int[] nums,boolean[] flag){

        if(temp.size()==nums.length){
           ans.add(new ArrayList<>(temp));
           return;
        }
        for(int i=0;i<nums.length;i++){
           if(!flag[i]){
            temp.add(nums[i]);
            flag[i]=true;
            dfs(ans,temp,nums,flag); 
            temp.remove(temp.size()-1);
            flag[i]=false;
        }
      }
    }
}
