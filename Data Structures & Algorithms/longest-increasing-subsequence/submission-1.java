class Solution {
    private int[][] memo;
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        memo = new int[n][n + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return solve(nums,0,-1);
    }
    public int solve(int[] nums,int i,int j){
        if(i>=nums.length){
            return 0;
        }
         if (memo[i][j + 1] != -1) {
            return memo[i][j + 1];
        }
        int notTake=solve(nums,i+1,j);
        int take=0;
        if( j==-1 || nums[i]>nums[j]){
          take=1+solve(nums,i+1,i);
        }
        return memo[i][j + 1]= Math.max(take,notTake);
    }
}
