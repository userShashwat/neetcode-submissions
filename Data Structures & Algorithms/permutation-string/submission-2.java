class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] char1=new int[26];
        int[] char2=new int[26];
          if (n > m) return false;
        for(int i=0;i<n;i++){
            char c=s1.charAt(i);
            char1[c-'a']++;
        }
         for(int i=0;i<n;i++){
            char c=s2.charAt(i);
            char2[c-'a']++;
        }
        int match=0;
        for(int i=0;i<26;i++){
            if(char1[i]==char2[i]){
              match++;
            }
        }
        int l=0;
        for(int r=n;r<m;r++){
            if(match==26)return true;
            char c1=s2.charAt(r);
            char2[c1-'a']++;
            if(char1[c1-'a']==char2[c1-'a']){
                match++;
            }
            else if(char1[c1-'a']+1==char2[c1-'a']){
                match--;
            }
            char c2=s2.charAt(l);
            char2[c2-'a']--;
            if(char1[c2-'a']==char2[c2-'a']){
                match++;
            }
            else if(char1[c2-'a']==char2[c2-'a']+1){
                match--;
            }
            l++;
        }
        return match==26;

    }
}
