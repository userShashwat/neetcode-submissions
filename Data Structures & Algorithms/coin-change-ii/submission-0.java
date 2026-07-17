class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        dp=new int[coins.length][amount+1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return solve(amount,coins,0);
    }
    public int solve(int amt,int[] arr,int i){
        if(amt==0){
            return 1;
        }    
        if(amt<0 || i>=arr.length){
            return 0;
        }
        if (dp[i][amt] != -1) return dp[i][amt];
        int res=solve(amt-arr[i],arr,i);
        int not=solve(amt,arr,i+1);
        
        return dp[i][amt]=res+not;
    }
}
