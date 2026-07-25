class Solution {
    int[][] dp;
    public int numDistinct(String s, String t) {
        int l1=s.length();
        if (t.length() > s.length()) {
            return 0;
        }
        int l2=t.length();
        dp=new int[l1+1][l2+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return solve(s,t,l1,l2,0,0);
    }
    public int solve(String s,String t,int l1,int l2,int i,int j){
        if(j==l2){
        return 1;
       }
       if(i>=l1){
        return 0;
       }
       if(dp[i][j]!=-1){
        return dp[i][j];
       }
       int res=solve(s,t,l1,l2,i+1,j);
       if(s.charAt(i) == t.charAt(j)){
        res+=solve(s,t,l1,l2,i+1,j+1);
       }
       return dp[i][j]=res;

    }
}
