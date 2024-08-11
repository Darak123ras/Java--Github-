/*
 * You are given an m x n binary grid grid where 1 represents land and 0 represents water. An island is a maximal 
 * 4-directionally (horizontal or vertical) connected group of 1's.
 * The grid is said to be connected if we have exactly one island, otherwise is said disconnected.
 * In one day, we are allowed to change any single land cell (1) into a water cell (0).
 * Return the minimum number of days to disconnect the grid.
 * Example 1:
 * Input: grid = [[0,1,1,0],[0,1,1,0],[0,0,0,0]]
 * Output: 2
 * Explanation: We need at least 2 days to get a disconnected grid.
 * Change land grid[1][1] and grid[0][2] to water and get 2 disconnected island.
 * Example 2:
 * Input: grid = [[1,1]]
 * Output: 2
 * Explanation: Grid of full water is also disconnected ([[1,1]] -> [[0,0]]), 0 islands.
 * Constraints:
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 30
 * grid[i][j] is either 0 or 1.
 */
// DFS, BFS, Array, Matrix

public class DisconnectIsland {
    public int minDays(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Check if grid is already disconnected
        if (countIslands(grid) != 1) {
            return 0;
        }
        
        // Check if removing one cell will disconnect the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    if (countIslands(grid) != 1) {
                        return 1;
                    }
                    grid[i][j] = 1; // Restore the original cell
                }
            }
        }
        
        // Otherwise, it takes 2 days to disconnect
        return 2;
    }
    
    private int countIslands(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int islands = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(grid, visited, i, j);
                    islands++;
                }
            }
        }
        
        return islands;
    }
    
    private void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == 0 || visited[i][j]) {
            return;
        }
        
        visited[i][j] = true;
        
        dfs(grid, visited, i - 1, j); // up
        dfs(grid, visited, i + 1, j); // down
        dfs(grid, visited, i, j - 1); // left
        dfs(grid, visited, i, j + 1); // right
    }
}
