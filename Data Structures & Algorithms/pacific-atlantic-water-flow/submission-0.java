class Solution {
        int[] rn={-1,0,1,0};
    int[] cn={0,1,0,-1};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
         List<List<Integer>> ans=new ArrayList<>();
         int c=heights[0].length;
         int r=heights.length;
         boolean[][] atlantic=new boolean[r][c];
         boolean[][] pacific=new boolean[r][c];
         for(int i=0;i<r;i++){
           dfs(heights,i,0,r,c,pacific);
           dfs(heights,i,c-1,r,c,atlantic);
         }
         for(int i=0;i<c;i++){
           dfs(heights,0,i,r,c,pacific);
           dfs(heights,r-1,i,r,c,atlantic);
         }
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
         
    }
    private void dfs(int[][] h,int i,int j,int r,int c,boolean[][] flag){
      flag[i][j]=true;
      for(int k=0;k<4;k++){
          int nr=i+rn[k];
          int nc=j+cn[k];
          if (nr>=0 && nr<r && nc >= 0 && nc<c && !flag[nr][nc] && h[nr][nc] >= h[i][j]){
              dfs(h,nr,nc,r,c,flag);
          }
      }
        
    }
}
