class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(candidates, target, ans, new ArrayList<>(), 0, 0);
        return ans;
    }
    public void dfs(int[] arr, int t,
                    List<List<Integer>> ans,
                    List<Integer> tm,
                    int ind,
                  int total) {
        if (total == t) {
            ans.add(new ArrayList<>(tm));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (total + arr[i] > t)
                break;
            if (i > ind && arr[i] == arr[i - 1])
                continue;
            tm.add(arr[i]);
            dfs(arr, t, ans, tm,
                i + 1,
                total + arr[i]);
            tm.remove(tm.size() - 1);
        }
    }
}