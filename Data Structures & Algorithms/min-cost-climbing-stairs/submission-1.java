class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        return Math.min(solve(cost, 0,dp), solve(cost, 1,dp));
    }
    public int solve(int[] cost,int index,int[] dp){
        if(index==cost.length){
            return 0;
        }
        else if(index==cost.length-1){
            return cost[index];
        }
        if(dp[index]!=0)return dp[index];
        int one=solve(cost,index+1,dp);
        int two=solve(cost,index+2,dp);
        int ans=Math.min(one,two);
        return dp[index] = cost[index]+ans;
    }
}
