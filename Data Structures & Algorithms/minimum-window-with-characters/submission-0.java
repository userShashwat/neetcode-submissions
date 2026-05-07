class Solution {
    public String minWindow(String s, String t) {
        int[] schar=new int[128];
        int[] tchar=new int[128];
        int n=t.length();
        int need=0;
        for(int i=0;i<n;i++){
           char c = t.charAt(i);
           if(tchar[c] == 0) need++; 
           tchar[c]++;
        }
        int l=0;int r=0;
        int have=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        StringBuilder str=new StringBuilder();
        while(r<s.length()){
            char c=s.charAt(r);
            schar[c]++;
            if(tchar[c]==schar[c]){
                have++;
            }
            while(have==need && l<=r){
                char ch=s.charAt(l);
                if((r-l+1)<min){
                    min=r-l+1;
                    start=l;
                }
                schar[ch]--;
                if(tchar[ch]==schar[ch]+1){
                    have--;
                }
                l++;
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}
