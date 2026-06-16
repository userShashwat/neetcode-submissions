class Solution {
    public int orangesRotting(int[][] grid) {
        int[] rx = {-1, 0, 1, 0};
        int[] cx = {0, 1, 0, -1};
        int fc=0;
        int r=grid.length;
        int c=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fc++;
                }
            }
        }
        int time=0;
        if(fc==0)return 0;
        while(!q.isEmpty() && fc>0){
            int n=q.size();
            for(int k=0;k<n;k++){
              int[] ans=q.poll();
              int row=ans[0];
              int col=ans[1];
              for(int i=0;i<4;i++){
                int nr=row+rx[i];
                int nc=col+cx[i];
                if (nr >= 0 && nr < r && nc >= 0 && nc < c && grid[nr][nc] == 1){
                    grid[nr][nc]=2;
                    fc--;
                    q.add(new int[]{nr,nc});
                }
              }
            }
            time++;   
        }
        return fc==0 ? time :-1;

    }
}
