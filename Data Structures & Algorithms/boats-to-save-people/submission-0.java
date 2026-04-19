class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        int cnt=0;
        while(l<=r){
            int sum=people[l]+people[r];
            if(sum<=limit){
                cnt++;
                l++;
                r--;
            }
            else if(sum>limit){
                r--;
                cnt++;
            }
        }
        return cnt;
    }
}