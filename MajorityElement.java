/*
 * Given an array arr. Find the majority element in the array. If no majority exists, return -1.

A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

Examples:

Input: arr[] = [3, 1, 3, 3, 2]
Output: 3
Explanation: Since, 3 is present more than n/2 times, so it is the majority element.
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than n/2 times, so it is the majority element.
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than n/2 times, so there is no majority element.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i]≤ 105
 */
// Flipkart, Amazon, Accolite, D.E. Shaw, Microsoft, Google, Nagaaro, Atlassian


public class MajorityElement {
    static int majorityElement(int arr[]) {
        // your code here
        int n =arr.length;
        if(n==1) return arr[0];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]) count++;
                if(count>n/2) return arr[i];
            }
        }
        return -1;
    }
}
