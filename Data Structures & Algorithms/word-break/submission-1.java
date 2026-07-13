public class Solution {
    private Map<Integer,Boolean> mp;
    public boolean wordBreak(String s, List<String> wordDict) {
        mp=new HashMap<>();
        mp.put(s.length(),true);
        return dfs(s, wordDict, 0);
    }

    private boolean dfs(String s, List<String> wordDict, int i) {
        if (mp.containsKey(i)) {
            return mp.get(i);
        }

        for (String w : wordDict) {
            if (i + w.length() <= s.length() &&
                s.substring(i, i + w.length()).equals(w)) {
                if (dfs(s, wordDict, i + w.length())) {
                    mp.put(i,true);
                    return true;
                }
            }
        }
        mp.put(i,false);
        return false;
    }
}