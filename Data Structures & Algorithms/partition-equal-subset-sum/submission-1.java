class Solution {
    boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0)return false;
        dp=new boolean[nums.length][sum/2+1];

        return solve(nums,sum/2,0);
    }
    public boolean solve(int[] nums,int t,int ind){
        if(ind==nums.length){
            return t==0;
        }
        if(t<0){
            return false;
        }
        if(dp[ind][t]!=false)return dp[ind][t];
        
        return dp[ind][t]= solve(nums,t-nums[ind],ind+1) || solve(nums,t,ind+1);
    }
}
