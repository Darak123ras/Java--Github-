/*
 * Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum.

Examples:

Input: arr[] = [1, 2, 3, -2, 5]
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
Input: arr[] = [-1, -2, -3, -4]
Output: -1
Explanation: Max subarray sum is -1 of element (-1)
Input: arr[] = [5, 4, 7]
Output: 16
Explanation: Max subarray sum is 16 of element (5, 4, 7)
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105
-107 ≤ arr[i] ≤ 107
 */
// Zoho, Flipkart, Microsoft, Samsung, Amazon, Accolite, Morgan Stanley, Walmart, Adobe, Google, Visa, Hike, D.E.Shaw
// Snapdeal, Oracle

public class KadaneAlgo {
    long maxSubarraySum(int[] arr) {

        // Your code here
        long max=Integer.MIN_VALUE;
        int n=arr.length;
        long sum=0;
        if(n==0) return sum;
        if(n==1){
            sum=arr[0];
            return sum;
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0) sum=0;
        }
        return max;
    }
}
