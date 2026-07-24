class Solution {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int ans=0;
        int r=matrix.length;
        int c=matrix[0].length;
        dp=new int[r][c];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans=Math.max(ans,dfs(matrix,i,j,r,c,Integer.MIN_VALUE));
            }
        }
        return ans;
    }
    public int dfs(int[][] mat,int i,int j,int r,int c,int preVal){
        if( i<0 || i>=r || j<0 || j>=c || mat[i][j]<=preVal)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int result=1;
        for(int k=0;k<4;k++){
            int nr=i+directions[k][0];
            int nc=j+directions[k][1];
            result=Math.max(result,1+dfs(mat,nr,nc,r,c,mat[i][j]));
        }
        return dp[i][j]=result;
    }
}
