class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n][W + 1];
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return solve(n - 1, W, val, wt, dp);
    }
    
    private int solve(int index, int capacity, int[] val, int[] wt, int[][] dp) {
        if (index < 0 || capacity == 0) {
            return 0;
        }
        
        if (dp[index][capacity] != -1) {
            return dp[index][capacity];
        }
        
        int exclude = solve(index - 1, capacity, val, wt, dp);
        
        
        int include = 0;
        if (wt[index] <= capacity) {
            include = val[index] + solve(index - 1, capacity - wt[index], val, wt, dp);
        }
        
      
        return dp[index][capacity] = Math.max(include, exclude);
    }
}
