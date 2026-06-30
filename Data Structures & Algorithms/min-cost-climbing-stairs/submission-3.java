class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //int[] dp=new int[cost.length];
        int prev1=cost[0];
        int prev2=cost[1];
        for(int i=2;i<cost.length;i++){
          int one=prev2;
          int two=prev1;
          int ans=Math.min(one,two);
          cost[i]= cost[i]+ans;
          prev1=prev2;
          prev2=cost[i];
        }
        return Math.min(prev1, prev2);
       
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
