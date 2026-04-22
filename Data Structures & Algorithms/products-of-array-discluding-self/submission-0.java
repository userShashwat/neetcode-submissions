class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] px=new int[n];
        for(int i=0;i<n;i++){
            if(i==0) px[i]=nums[i];
            else px[i]=px[i-1]*nums[i];
        }
       // int n=nums.length;
        int[] sx=new int[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1) sx[i]=nums[i];
            else sx[i]=sx[i+1]*nums[i];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
          if(i==0){
            ans[i]=sx[i+1];
          }
          else if(i==n-1){
            ans[i]=px[i-1];
          }
          else{
            ans[i]=px[i-1]*sx[i+1];
          }
        }
        return ans;
    }
}  
