class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] vis=new int[n];
        int[] owner=new int[n];
        for(int i=0;i<trust.length;i++){
            int a=trust[i][0]-1;
            int b=trust[i][1]-1;
            vis[a]=1;
            owner[b]++;
        }
        //int ans=-1;
        for( int i=0;i<n;i++){
           if(vis[i]==0 && owner[i]==n-1){
               return i+1;
           }
        }
        return -1;
    }
}