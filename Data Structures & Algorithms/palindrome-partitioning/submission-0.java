class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        dfs(ans,temp,s,0);
        return ans;
    }
    public void dfs(List<List<String>> ans,List<String> temp,String s,int i){
        if(i==s.length()){
            ans.add(new ArrayList<>(temp));
            return; 
        }
        for(int j=i;j<s.length();j++){
            if(check(s,i,j)){
                temp.add(s.substring(i, j + 1));
                dfs(ans,temp,s,j+1);
                temp.remove(temp.size()-1);
            }
           
        

        }
    }
    public boolean check(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
