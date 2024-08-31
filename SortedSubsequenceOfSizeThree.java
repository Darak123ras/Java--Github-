/*
 * You are given an array arr, you need to find any three elements in it such that arr[i] < arr[j] < arr[k] and i < j < k.

Note:
The output will be 1 if the subsequence returned by the function is present in the array arr
If the subsequence is not present in the array then return an empty array, the driver code will print 0.
If the subsequence returned by the function is not in the format as mentioned then the output will be -1.
Examples :

Input: arr = [1, 2, 1, 1, 3]
Output: 1
Explanation: A subsequence 1 2 3 exist.
Input: arr = [1, 1, 3]
Output: 0
Explanation: No such Subsequence exist, so empty array is returned (the driver code automatically prints 0 in this case).
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 106
 */

import java.util.ArrayList;
import java.util.List;

public class SortedSubsequenceOfSizeThree {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        int n=arr.length;
        List<Integer> result=new ArrayList<>();
        if (n < 3) return result; 

        int[] left_min = new int[n];
        int[] right_max = new int[n];
        
        left_min[0] = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            left_min[i] = Math.min(left_min[i - 1], arr[i - 1]);
        }

        right_max[n - 1] = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], arr[i + 1]);
        }

        for (int j = 1; j < n - 1; j++) {
            if (left_min[j] < arr[j] && arr[j] < right_max[j]) {
                result.add(left_min[j]);
                result.add(arr[j]);
                result.add(right_max[j]);
                return result;
            }
        }
        
        return result;
    }
}
