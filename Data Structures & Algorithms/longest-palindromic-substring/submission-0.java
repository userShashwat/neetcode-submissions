class Solution {
    public String longestPalindrome(String s) {
        int left=0;
        int right=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int len1=solve(s,i,i);
            int len2=solve(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>right-left){
                left=i-(len-1)/2;
                right=i+len/2;
            }
        }
        return s.substring(left,right+1);
    }
    public int solve(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return (r-l)-1;
    }
    
}
