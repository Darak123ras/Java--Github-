/*
 * Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr.

Note: It is guaranteed that the output fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
Input: arr[] = [-1, -3, -10, 0, 60]
Output: 60
Explanation: The subarray with maximum product is {60}.
Input: arr[] = [2, 3, 4] 
Output: 24 
Explanation: For an array with all positive elements, the result is product of all elements. 
Constraints:
1 ≤ arr.size() ≤ 106
-10  ≤  arr[i]  ≤  10
 */
// Morgan Stanley, D.E.Shaw, Microsoft, Amazon, Google, OYO

public class MaximunProductSubarray {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        
        if(n==0) return 0;
        if(n==1){
            return arr[0];
        }
        int maxPro=Integer.MIN_VALUE;
        int i=0;
        while(i<n){
            int j=i+1;
            int product=arr[i];
            if(maxPro<product){
                    maxPro=product;
            }
            while(j<n){
                product*=arr[j];
                if(maxPro<product){
                    maxPro=product;
                }
                j++;
            }
            i++;
        }
        return maxPro;
    }
}
