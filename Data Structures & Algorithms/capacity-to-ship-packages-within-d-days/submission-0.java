class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min =0,max=0;
        for(int i :weights){
            if(i>min){
                min=i;
            }
            max+=i;
        }
        int l=min;
        int h=max;

        while(l<=h){
            int mid=l + (h - l) / 2;
            int check=sum(weights,mid);
            if(check<=days){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public int sum(int[] arr,int m){
        int day=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=m){
               sum+=arr[i];
            }
            else{
              day++;
              sum=arr[i];
            }
        }
        return day;
    }
}