

class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return -1;
        int r=grid.length;
        int c=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh == 0) return 0;
        int[] rd={-1,0,1,0};
        int[] cd={0,1,0,-1};
        int cnt=0;
        int minCnt=0;
        while(!q.isEmpty()){
            int size=q.size();
            cnt+=size;
            for(int k=0;k<size;k++){
                int[] orange=q.poll();
                for(int i=0;i<4;i++){
                    int x=orange[0]+rd[i];
                    int y=orange[1]+cd[i];
                    if(x<0 || y<0 || x>=r || y>=c || grid[x][y]!=1){
                        continue;
                    }
                    grid[x][y]=2;
                    q.offer(new int[]{x,y});
                    fresh--;
                }
            }
            if(!q.isEmpty()){
                minCnt++;
            }
        }
        return fresh==0 ? minCnt : -1;
    }
}