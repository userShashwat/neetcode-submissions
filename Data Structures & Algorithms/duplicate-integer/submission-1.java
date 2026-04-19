class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashMap<Integer,Integer> mp=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(mp.containsKey(nums[i])){
                return true;
        }
        else {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
      }   
      return false;
    }
}