class Solution {
    public boolean validPalindrome(String s) {
       return  isValid(s,0,s.length()-1,false);
    }
    public boolean isValid(String s,int l,int r,boolean flag){
        while(l<r){
        if(s.charAt(l)!=s.charAt(r)){
            if(flag)return false;
            return isValid(s,l+1,r,true) || isValid(s,l,r-1,true);
        }
        l++;
        r--;
        }
        return true;
    }
}