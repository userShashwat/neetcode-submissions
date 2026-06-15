class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index=new int[26];
        for(int i=0;i<order.length();i++){
            index[order.charAt(i)-'a']=i;
        }
        for(int i=0 ; i<words.length-1;i++){
            String a=words[i];
            String b=words[i+1];
        
            for(int j=0;j<a.length();j++){
                if(j==b.length())return false;
                char c1=a.charAt(j);
                char c2=b.charAt(j);
                if (c1 != c2) {
                    if (index[c1 - 'a'] > index[c2 - 'a']) {
                        return false;
                    }
                    break;  
                }
                
            }
        } 
        return true;
    }
}