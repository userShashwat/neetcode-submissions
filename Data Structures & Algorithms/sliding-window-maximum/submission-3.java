public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];
        
        int[] ans = new int[n - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((i, j) -> nums[j] - nums[i]);
        for (int i = 0; i < n; i++) {
            pq.offer(i);
            while (pq.peek() <= i - k) {
                pq.poll();
            }
            if (i >= k - 1) {
                ans[i - k + 1] = nums[pq.peek()];
            }
        }
        return ans;
    }
}