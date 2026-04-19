class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=(n/2-1);i>=0;i--){
            heapify(nums,i,n);
        }
        for(int i=n-1;i>=0;i--){
            int temp=nums[i];
            nums[i]=nums[0];
            nums[0]=temp;
            heapify(nums,0, i);
        }
        return nums;
    }
    public void heapify(int[] nums,int i,int n){
        int largest=i;
        int l=i*2+1;
        int r=i*2+2;
        if(l<n && nums[largest]<nums[l]){
            largest=l;
        }
       if(r<n && nums[largest]<nums[r]){
            largest=r;
        }
        if(largest!=i){
            int temp=nums[i];
            nums[i]=nums[largest];
            nums[largest]=temp;
        
        heapify(nums,largest,n);
        }
    }
}
