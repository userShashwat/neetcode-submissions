class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int[] pt:points){
            int dist=pt[0]*pt[0]+pt[1]*pt[1];
            pq.offer(new int[]{dist,pt[0],pt[1]});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            int[] point=pq.poll();
            ans[i]=new int[]{point[1],point[2]};
        }
        return ans;
    }
}
