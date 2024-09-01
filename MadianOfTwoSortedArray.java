/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */

import java.util.Arrays;

public class MadianOfTwoSortedArray {
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int len=n+m;
        int arr[]=new int[len];
        if(n==0 && m==0) return 0;
        if(n==1 && m==0) return nums1[0];
         if(n==0 && m==1) return nums2[0];
         if(n==1 && m==1) return (nums1[0]+nums2[0])/2.0;
         int i=0;
         while(i<n){
                arr[i]=nums1[i];
                i++;
            }
            int j=0;
            while(i<len){
                arr[i]=nums2[j];
                i++;
                j++;
            }

         Arrays.sort(arr);
         if(len%2==0){
            return (arr[len/2-1]+arr[len/2])/2.0;
         }else{
            return arr[len/2];
            
         }
    }
}
