class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int i = cell[0], j = cell[1];       
            for (int[] dir : directions) {
                int ni = i + dir[0];
                int nj = j + dir[1];            
                if (ni >= 0 && ni < r && nj >= 0 && nj < c && grid[ni][nj] == Integer.MAX_VALUE) {
                    grid[ni][nj] = grid[i][j] + 1;
                    queue.offer(new int[]{ni, nj});
                }
            }
        }
    }
}