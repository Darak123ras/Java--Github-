/*You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104 */
// Accenture, Uber, HSBC, Cisco, The D.E.Shaw, Accolite

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=0;
        while(i<n){
            // if(i==0 && j==0 && matrix[i][j]>target) return false;
            // if(i==n-1 && j==m-1 && matrix[i][j]>target) return false;
            if(matrix[i][j]<=target && matrix[i][m-1]>=target){
                for(int k=0;k<m;k++){
                    if(matrix[i][k]==target) return true;
                }
                break;
            }
            i++;
        }
        return false;
    }
}
