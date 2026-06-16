class Solution {
    int[] rn={-1,0,1,0};
    int[] cn={0,1,0,-1};
    int cnt=0;
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                cnt=Math.max(cnt,dfs(grid,i,j,r,c));
            }
        }
        return cnt;
    }
    private int dfs(int[][] grid,int i,int j,int r,int c){
        if(i<0 || j<0  || i>=r  || j>=c || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int res=1;
        for(int k=0;k<4;k++){
            int nr=i+rn[k];
            int nc=j+cn[k];
            res+=dfs(grid,nr,nc,r,c);
        }
        return res;
    }
}
