class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int len=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int h=heights[st.pop()];
                int w= !st.isEmpty() ? i-st.peek()-1: i;
                len=Math.max(len,h*w);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int h = heights[st.pop()];
            int w = st.isEmpty() ? n : n - st.peek() - 1;
            len = Math.max(len, h * w);
        }
        return len;
    }
}