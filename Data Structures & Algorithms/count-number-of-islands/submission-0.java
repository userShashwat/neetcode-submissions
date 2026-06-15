class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }
    public void dfs(char[][] c ,int i,int j){
        if(i<0 || i>=c.length || j<0 || j>=c[0].length || c[i][j]!='1'){
            return;
        }
        c[i][j]='0';
        dfs(c,i+1,j);
        dfs(c,i-1,j);
        dfs(c,i,j+1);
        dfs(c,i,j-1);
    } 
}

