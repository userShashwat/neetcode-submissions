class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r=0;
        int n=piles.length;
        for(int i:piles){
           r=Math.max(r,i);
        }
        int l=1;
        while(l<=r){
            int mid=(l+r)/2;
            if(solve(mid,piles)>h){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
    public int solve(int k,int[] a){
        int c=0;
        for(int i:a){
            if(i<k){
             c=c+1;
            }
            else if(i%k==0)c+=i/k;
            else{
                c+=(i/k)+1;
            }
        }
        return c;
    }
}
