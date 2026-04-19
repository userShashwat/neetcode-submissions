class Solution {
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        int[][] vis=new int [r][c];
        int[] rd={-1,0,1,0};
        int[] cd={0,1,0,-1};
        for(int i=0;i<c;i++){
            if(vis[0][i]==0 && board[0][i]=='O'){
                dfs(board,rd,cd,vis,0,i);
            }
            if(vis[r-1][i]==0 && board[r-1][i]=='O' ){
                 dfs(board,rd,cd,vis,r-1,i);
            }
        }
          for(int i=0;i<r;i++){
            if(vis[i][0]==0 && board[i][0]=='O'){
                dfs(board,rd,cd,vis,i,0);
            }
            if(vis[i][c-1]==0 && board[i][c-1]=='O' ){
                 dfs(board,rd,cd,vis,i,c-1);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(vis[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }

    }
     public void dfs(char[][] br,int[] delr,int[] delc,int[][] vis,int r,int c){
        vis[r][c]=1;
        int m=br.length;
        int n=br[0].length;
        for(int i=0;i<4;i++){
            int nrow=r+delr[i];
            int ncol=c+delc[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && br[nrow][ncol]=='O') {
                dfs(br,delr,delc,vis,nrow,ncol);
            }
        }
    }
}