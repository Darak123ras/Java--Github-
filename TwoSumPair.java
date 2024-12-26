/*
 * Given an array arr[] of positive integers and another integer target. Determine if there exists two distinct indices such that the sum of there elements is equals to target.

Examples:

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.
Input: arr[] = [1, 2, 4, 3, 6], target = 11
Output: false
Explanation: None of the pair makes a sum of 11.
Constraints:
1 ≤ arr.size ≤ 105
1 ≤ arr[i] ≤ 105
1 ≤ target ≤ 2*105
 */
// Microsoft, Zoho, Adobe, Google, Amazon, Morgan Stanley, Flipkart, SAP Lab, Wipro, Accolite

public class TwoSumPair {
    boolean twoSum(int arr[], int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=arr[j]+arr[i];
            if(sum==target ) return true;
            else if(sum<target) i++;
            else j--;
        }
        
        return false;
    }
}
