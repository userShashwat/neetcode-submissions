class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null ||strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String str : strs){
              char[] chars=str.toCharArray();
              Arrays.sort(chars);
              String sorted=new String(chars);
              if(!mp.containsKey(sorted)){
                mp.put(sorted,new ArrayList<>());
              }
              mp.get(sorted).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
