class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[][] car=new int[n][2];
        for(int i=0;i<n;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }
        Arrays.sort(car, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> st=new Stack<>();
        for(int i=0;i<n;i++){
            int d=car[i][0];
            int s=car[i][1];
            double  t=(double)(target-d)/s;
            if(!st.isEmpty() && t<=st.peek()){
                continue;
            }
            st.push(t);

        }
        return st.size();
    }
}
