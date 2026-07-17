class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
    public int solve(int[] nums,int t,int i,int sum){
        if(i==nums.length){
            return t==sum?1:0;
        }
        int add=solve(nums,t,i+1,sum+nums[i]);
        int sub=solve(nums,t,i+1,sum-nums[i]);
        return add+sub;
    }
}
