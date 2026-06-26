class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>(n+1);
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int t=times[i][2];
            adj.get(u).add(new int[]{v, t});
        }
        int[] dist=new int[n+1];
         Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
       
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0,k});
        while(!pq.isEmpty()){
            int[] arr=pq.poll();
            int node=arr[1];
            int time=arr[0];
            if (time > dist[node]) continue;
            for(int[] i : adj.get(node)){
                int newNode=i[0];
                int newTime=i[1];
                if(dist[newNode]>newTime+time){
                    dist[newNode]=time+newTime;
                    pq.add(new int[]{dist[newNode],newNode});
                }
            }
        }
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, dist[i]);
        }
        
        return maxTime;

    }
}
