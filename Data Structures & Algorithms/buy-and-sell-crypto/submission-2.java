class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int l=0;
        int r=0;
        int n=prices.length;
        while(r<n){
            if(prices[l]>prices[r]){
                l=r;
            }
            max=Math.max(max,prices[r]-prices[l]);
            r++;
        }
        return max;
        
    }
}
