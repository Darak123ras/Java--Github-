/*
 * Problem statement
You are given an array of ‘N’ integers, you need to find the maximum of minimum for every window size. 
The size of the window should vary from 1 to ‘N’ only.
For example:
ARR = [1,2,3,4]
Minimums of window size 1 = min(1), min(2), min(3), min(4) = 1,2,3,4
Maximum among (1,2,3,4)  is 4
Minimums of window size 2 = min(1,2), min(2,3),   min(3,4) = 1,2,3
Maximum among (1,2,3) is 3
Minimums of window size 3 = min(1,2,3), min(2,3,4) = 1,2
Maximum among (1,2) is 2
Minimums of window size 4 = min(1,2,3,4) = 1
Maximum among them is 1
The output array should be [4,3,2,1].
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 100
1 <= N <= 10 ^ 4 
-10 ^ 9 <= ARR[i] <= 10 ^ 9
Where ‘T’ is the number of test cases, ‘N’ is the size of the array and ‘ARR[i]’ is the size of the array elements.
Time Limit: 1 sec
Sample Input 1:
2
4
1 2 3 4
5
3 3 4 2 4    
Sample Output 1:
4 3 2 1
4 3 3 2 2
Explanation for sample input 1:
Test case 1:
Already explained in the question.

Test case 2:
Minimums of window size 1 = min(3), min(3), min(4), min(2), min(4) = 3, 3, 4, 2, 4
Maximum among (3, 3, 4, 2, 4) is 4
Minimums of window size 2 = min(3,3), min(3,4), min(4,2), min(2,4) = 3, 3, 2, 2
Maximum among (3, 3, 2, 2) is 3
Minimums of window size 3 = min(3,3,4), min(3,4,2), min(4,2,4) = 3, 2, 2
Maximum among (3, 2, 2) is 3
Minimums of window size 4 = min(3,3,4,2), min(3,4,2,4) = 2, 2
Maximum among (2, 2) is 2
Minimums of window size 4 = min(3,3,4,2,4) = 2
Maximum among them is 2
The output array should be [4,3,3,2,2].
Sample Input 2:
2
5 
45 -2 42 5 -11 
6 
-2 12 -1 1 20 1 
Sample Output 2:
 45 5 -2 -2 -11
 20 1  1 -1 -1 -2
 */
// Microsoft, Cognizant, IBM, Amdocs

import java.util.*;

public class MaximumOfMinimumForEveryWindowSize {
    public static int[] maxMinWindow(int[] a, int n) {
        int[] result = new int[n];
        Arrays.fill(result, Integer.MIN_VALUE);

        // Arrays to store the previous and next smaller elements
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);  // Initialize with n (out of bounds)
        Arrays.fill(left, -1);  // Initialize with -1 (out of bounds)

        // Stack to find previous and next smaller elements
        Stack<Integer> stack = new Stack<>();

        // Compute the left array (previous smaller elements)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear(); // Clear the stack for the next computation

        // Compute the right array (next smaller elements)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }

        // Calculate maximum of minimums for every window size
        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1; // Calculate window size where arr[i] is the minimum
            result[len - 1] = Math.max(result[len - 1], a[i]);
        }

        // Fill in the remaining values by taking the maximum to the right
        for (int i = n - 2; i >= 0; i--) {
            result[i] = Math.max(result[i], result[i + 1]);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4};
        int[] result1 = maxMinWindow(arr1, arr1.length);
        System.out.println(Arrays.toString(result1)); // Expected output: [4, 3, 2, 1]

        int[] arr2 = {3, 3, 4, 2, 4};
        int[] result2 = maxMinWindow(arr2, arr2.length);
        System.out.println(Arrays.toString(result2)); // Expected output: [4, 3, 3, 2, 2]
    }
}
