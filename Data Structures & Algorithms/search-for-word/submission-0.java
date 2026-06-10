class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, vis, i, j, n, m, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] arr, String s, boolean[][] vis, int r, int c, int n, int m, int idx) {
        if (idx == s.length()) {
            return true;
        }   
        if (r < 0 || r >= n || c < 0 || c >= m || vis[r][c] || arr[r][c] != s.charAt(idx)) {
            return false;
        }  
        vis[r][c] = true;    
        if (dfs(arr, s, vis, r - 1, c, n, m, idx + 1)) return true;
        if (dfs(arr, s, vis, r, c + 1, n, m, idx + 1)) return true;
        if (dfs(arr, s, vis, r + 1, c, n, m, idx + 1)) return true;
        if (dfs(arr, s, vis, r, c - 1, n, m, idx + 1)) return true; 
        vis[r][c] = false;
        return false;
    }
}