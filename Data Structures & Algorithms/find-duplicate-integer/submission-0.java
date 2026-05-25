class Solution {
    public int findDuplicate(int[] nums) {
         for(int i :nums){
            int idx=Math.abs(i)-1;
            if(nums[idx]<1)return Math.abs(i);
            nums[idx]*=-1;
         }
         return -1;
        
    }
}
