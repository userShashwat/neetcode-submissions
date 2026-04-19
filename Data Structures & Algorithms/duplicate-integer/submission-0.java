class Solution {
    public boolean hasDuplicate(int[] nums) {
    
       for(int i=0;i<nums.length;i++){
        int cnt=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                cnt++;
            }
        }
        if(cnt>=1)return true;
       }
       return false;
    }
}
