class Solution {
    public int maxProduct(int[] nums) {
     int p=0;
     int s=0;
     int n=nums.length;
     int maxi=nums[0];
     for(int i=0;i<nums.length;i++){
        p = nums[i] * (p == 0 ? 1 : p);
        s = nums[n-1-i] *(s==0 ? 1: s);
        maxi=Math.max(maxi,Math.max(p,s));
     }
     return maxi;

    }
}
