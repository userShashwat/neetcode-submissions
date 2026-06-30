class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<cost.length;i++){
          int one=dp[i-1];
          int two=dp[i-2];
          int ans=Math.min(one,two);
          dp[i] = cost[i]+ans;
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
       
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
