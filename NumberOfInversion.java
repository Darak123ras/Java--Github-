/*
 * Problem statement
There is an integer array ‘A’ of size ‘N’.



Number of inversions in an array can be defined as the number of pairs of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’.

You must return the number of inversions in the array.



For example,
Input:
A = [5, 3, 2, 1, 4], N = 5
Output:
7
Explanation: 
The pairs satisfying the condition for inversion are (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), and (3, 4). 
The number of inversions in the array is 7.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
4
4 3 2 1
Sample Output 1:
6
Explanation Of Sample Input 1:
Input:
A = [4, 3, 2, 1], N = 4
Output:
6
Explanation: 
The pairs satisfying the condition for inversion are (1, 2), (1, 3), (1, 4), (2, 3), (2, 4), and (3, 4).    
The number of inversions in the array is 6.
Sample Input 2:
5
1 20 6 4 5
Sample Output 2:
5
Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^9
Time Limit: 1 sec
 */

public class NumberOfInversion {
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        return mergeSortAndCount(a, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] a, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = 0;

        count += mergeSortAndCount(a, left, mid);
        count += mergeSortAndCount(a, mid + 1, right);

        count += mergeAndCount(a, left, mid, right);

        return count;
    }

    private static int mergeAndCount(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        int count = 0;

        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                count += (mid - i + 1);
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            a[i] = temp[k];
        }

        return count;
    }
}
