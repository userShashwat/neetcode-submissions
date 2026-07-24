class Solution {
    Boolean [][]dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length();
        int m=s2.length();
        dp=new Boolean[n+1][m+1];
        return dfs(s1,s2,s3,0,0,0);
    }
    public boolean dfs(String a,String b,String c,int i,int j,int k){
        if(c.length()==k){
            return a.length()==i && b.length()==j;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        boolean result=false;
        if(i<a.length() && a.charAt(i)==c.charAt(k)){
             result=dfs(a,b,c,i+1,j,k+1);
        }
        if(!result && j<b.length() && b.charAt(j)==c.charAt(k)){
            result= dfs(a,b,c,i,j+1,k+1);
        }
        dp[i][j]=result;
        return dp[i][j];
    }
}