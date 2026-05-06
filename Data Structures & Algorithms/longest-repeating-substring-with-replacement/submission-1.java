class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        int len=0;
        int l=0;
        int r=0;
        int cntMax=0;
        while(r<n){
            char c=s.charAt(r);
            mp.put(c,mp.getOrDefault(c,0)+1);
            cntMax=Math.max(cntMax,mp.get(c));
            while((r-l+1)-cntMax>k){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}
