class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq=new  PriorityQueue<>(
            (x,y)-> x.getValue()- y.getValue()
        );
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans=new int[k];
        int index = 0;
        while (!pq.isEmpty()) {
            ans[index++] = pq.poll().getKey();
        }

        return ans;
    }
}
