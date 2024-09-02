/*
 * Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

Examples:

Input: arr = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr = [10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist so answer is -1.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arri ≤ 105
 */
// SAP Lab, Rockstand


public class SecondLargest {
    public int print2largest(int[] arr) {
        // Code Here
        int n=arr.length;
        if(n<2) return -1;
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int i=0;
        while(i<n){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }else if(second<arr[i] && arr[i]<first){
                second=arr[i];
            }
            i++;
        }
        if(second==Integer.MIN_VALUE) return -1;
        return second;
    }
}
