/*
 * You are given two integers m and n, which represent the dimensions of a matrix.

You are also given the head of a linked list of integers.

Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.

Return the generated matrix.

 

Example 1:


Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
Explanation: The diagram above shows how the values are printed in the matrix.
Note that the remaining spaces in the matrix are filled with -1.
Example 2:


Input: m = 1, n = 4, head = [0,1,2]
Output: [[0,1,2,-1]]
Explanation: The diagram above shows how the values are printed from left to right in the matrix.
The last space in the matrix is set to -1.
 

Constraints:

1 <= m, n <= 105
1 <= m * n <= 105
The number of nodes in the list is in the range [1, m * n].
0 <= Node.val <= 1000
 */


   

public class SpiralMatrixsIV {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix=new int[m][n];
        if(m==0 && n==0) return matrix;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=-1;
            }
        }

        if(head==null) return matrix;

        int top=0,bottom=m-1;
        int left=0,right=n-1;

        ListNode curr=head;

        while (curr != null && top <= bottom && left <= right) {
            // top:left to right
            
            for(int j=left; j <= right && curr != null;j++){
                matrix[top][j]=curr.val;
                curr=curr.next;
            }
            top++;
            // right:top to bottom
            
            for(int j = top; j <= bottom && curr != null;j++){
                matrix[j][right]=curr.val;
                curr=curr.next;
            }
            right--;
            // bottom:right to left
            
            for(int j=right;j>=left && curr != null;j--){
                matrix[bottom][j]=curr.val;
                curr=curr.next;
            }
            bottom--;
            // bottom:bottom to top
            
            for(int j=bottom;j>=top && curr != null;j--){
                matrix[j][left]=curr.val;
                curr=curr.next;
            }
            left++;
        }

        return matrix;
        
    }
}
/**
 * Definition for singly-linked list.
 *  */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
