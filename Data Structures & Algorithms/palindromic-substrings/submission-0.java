class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            int odd=solve(s,i,i);
            int even=solve(s,i,i+1);
            res+=odd+even;
        }
        return res;
    }
    public int solve(String s,int l,int r){
        int res=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            res++;
            l--;
            r++;
        }
        return res;
    }
}
