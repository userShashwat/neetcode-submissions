class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String s="";
        recur(ans,s,n,0,0);
        return ans;
    }
    public void recur(List<String> ans,String s,int n,int open,int close){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }
        if(open<n){
            recur(ans,s+"(",n,open+1,close);
        }
        if(open>close){
            recur(ans,s+")",n,open,close+1);
        }
    }
}
