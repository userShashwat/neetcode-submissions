class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         for(int i : stones){
            pq.add(i);
         }
         while(pq.size()>1){
            int frist =pq.remove();
            int second =pq.remove();
            if(frist==second)continue;
            else{
                pq.add(frist-second);
            }
         }
         return pq.isEmpty() ? 0 : pq.remove();
    }
}
