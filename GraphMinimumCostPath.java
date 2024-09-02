/*
 * 
 * Given a square grid of size N, each cell of which contains an integer cost that represents a cost to traverse through that cell, we need to find a path from the top left cell to the bottom right cell by which the total cost incurred is minimum.
From the cell (i,j) we can go (i,j-1), (i, j+1), (i-1, j), (i+1, j).  

Examples :

Input: grid = {{9,4,9,9},{6,7,6,4},{8,3,3,7},{7,4,9,10}}
Output: 43
Explanation: The grid is-
9 4 9 9
6 7 6 4
8 3 3 7
7 4 9 10
The minimum cost is-
9 + 4 + 7 + 3 + 3 + 7 + 10 = 43.
Input: grid = {{4,4},{3,7}}
Output: 14
Explanation: The grid is-
4 4
3 7
The minimum cost is- 4 + 3 + 7 = 14.
Expected Time Complexity: O(n2*log(n))
Expected Auxiliary Space: O(n2) 
 Constraints:
1 ≤ n ≤ 500
1 ≤ cost of cells ≤ 500
 */
// Samsung. Amazon, Microsoft, Goldman Sachs, MakeMyTrip

import java.util.Arrays;
import java.util.PriorityQueue;

public class GraphMinimumCostPath {
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
	private static final int[] dRow = {-1, 1, 0, 0};
    private static final int[] dCol = {0, 0, -1, 1};
    
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int[][] cost = new int[n][m];
        
        for (int[] row : cost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{grid[0][0], 0, 0});
        cost[0][0] = grid[0][0];
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentCost = current[0];
            int row = current[1];
            int col = current[2];

            if (row == n - 1 && col == m - 1) {
                return currentCost;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                    int newCost = currentCost + grid[newRow][newCol];

                    if (newCost < cost[newRow][newCol]) {
                        cost[newRow][newCol] = newCost;
                        pq.add(new int[]{newCost, newRow, newCol});
                    }
                }
            }
        }

        return -1;
    }
}
