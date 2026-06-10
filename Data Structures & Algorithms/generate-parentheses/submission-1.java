class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        String x="";
        dfs(s,0,0,n,x);
        return s;
    }
    public void dfs(List<String> s,int left,int right,int len,String x){
        if(x.length()==len*2){
            s.add(x);
            return;
        }
        if(left<len){
            dfs(s,left+1,right,len,x+"(");
        }
        if(left>right){
            dfs(s,left,right+1,len,x+")");
        }
    }
}
