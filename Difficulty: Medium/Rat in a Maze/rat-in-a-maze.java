class Solution {
    // 1. Added 'void' return type
    public static void helper(int[][] mat, int r, int c, String path, ArrayList<String> ans, boolean[][] vis, int n) {
        // 2. Added boundary and safety checks
        if (r < 0 || c < 0 || r >= n || c >= n || mat[r][c] == 0 || vis[r][c]) {
            return;
        }

        // Destination reached
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        // 3. Mark the current cell as visited
        vis[r][c] = true;

        // 4. Move in Lexicographical Order: D, L, R, U (Down, Left, Right, Up)
        helper(mat, r + 1, c, path + "D", ans, vis, n); // Down
        helper(mat, r, c - 1, path + "L", ans, vis, n); // Left
        helper(mat, r, c + 1, path + "R", ans, vis, n); // Right
        helper(mat, r - 1, c, path + "U", ans, vis, n); // Up

        // 5. BACKTRACK: Unmark the cell so it can be part of other paths
        vis[r][c] = false;
    }

    public ArrayList<String> ratInMaze(int[][] mat) {
        int n = mat.length;
        ArrayList<String> ans = new ArrayList<>();
        
        // Base case: if start or end is blocked
        if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) {
            return ans;
        }
        
        // Initialize visited array here, NOT inside the helper
        boolean[][] vis = new boolean[n][n];
        helper(mat, 0, 0, "", ans, vis, n);
        
        // The problem usually asks for sorted order; 
        // calling D-L-R-U in that order handles this automatically.
        return ans;
    }
}