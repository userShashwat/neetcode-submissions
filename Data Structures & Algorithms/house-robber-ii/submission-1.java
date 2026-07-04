class Solution {
    
    public int rob(int[] nums) {
        int n=nums.length;
        int[] d1=new int[n];
        int[] d2=new int[n];
        Arrays.fill(d1,-1);
        Arrays.fill(d2,-1);
        if(n==1){
            return nums[0];
        }
        //int n=nums.length;
        return Math.max(solve(nums,0,n-1,d1),solve(nums,1,n,d2));
    }
    public int solve(int[] nums,int s,int e,int[] dp){
        if(s>=e){
          return 0;
        }
        if(dp[s]!=-1)return dp[s];
        int pick=nums[s]+solve(nums,s+2,e,dp);
        int notPick=solve(nums,s+1,e,dp);
        return dp[s]=Math.max(pick,notPick);
    }
}
