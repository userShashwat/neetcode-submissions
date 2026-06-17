class Solution {
    public void solve(char[][] board) {
      int r=board.length;
      int c=board[0].length;
      int[][] vis=new int[r][c];
      for(int i=0;i<r;i++){
        if(board[i][0]=='O')
          dfs(board,vis,i,0,r,c);
      }
       for(int i=0;i<r;i++){
        if(board[i][c-1]=='O')
          dfs(board,vis,i,c-1,r,c);
      }
       for(int i=0;i<c;i++){
        if(board[0][i]=='O')
          dfs(board,vis,0,i,r,c);
      }
       for(int i=0;i<c;i++){
        if(board[r-1][i]=='O')
           dfs(board,vis,r-1,i,r,c);
      }
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(board[i][j]=='O' && vis[i][j]==0){
                board[i][j]='X';
            }
        }
      }

    }
    public void dfs(char[][] b,int[][] vis,int i,int j,int r,int c){
        if(i<0 || j<0 || i>=r || j>=c || vis[i][j]==1 || b[i][j]=='X' ){
            return;
        }
        vis[i][j]=1;
        dfs(b,vis,i+1,j,r,c);
        dfs(b,vis,i-1,j,r,c);
        dfs(b,vis,i,j+1,r,c);
        dfs(b,vis,i,j-1,r,c);
    }
}