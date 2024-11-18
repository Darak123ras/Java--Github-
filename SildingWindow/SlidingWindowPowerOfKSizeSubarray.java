/*
 * You are given an array of integers nums of length n and a positive integer k.

The power of an array is defined as:

Its maximum element if all of its elements are consecutive and sorted in ascending order.
-1 otherwise.
You need to find the power of all 
subarrays
 of nums of size k.

Return an integer array results of size n - k + 1, where results[i] is the power of nums[i..(i + k - 1)].

 

Example 1:

Input: nums = [1,2,3,4,3,2,5], k = 3

Output: [3,4,-1,-1,-1]

Explanation:

There are 5 subarrays of nums of size 3:

[1, 2, 3] with the maximum element 3.
[2, 3, 4] with the maximum element 4.
[3, 4, 3] whose elements are not consecutive.
[4, 3, 2] whose elements are not sorted.
[3, 2, 5] whose elements are not consecutive.
Example 2:

Input: nums = [2,2,2,2,2], k = 4

Output: [-1,-1]

Example 3:

Input: nums = [3,2,3,2,3,2], k = 2

Output: [-1,3,-1,3,-1]

 

Constraints:

1 <= n == nums.length <= 500
1 <= nums[i] <= 105
1 <= k <= n
 */


public class SlidingWindowPowerOfKSizeSubarray {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] helper=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            helper[i]=-1;
        }
        if(n<k) return helper;
        for(int i=0;i<n-k+1;i++){
            int[] arr=new int[i+k];
            int l=0;
            for(int j=i;j<=i+k-1;j++){ 
                arr[l]=nums[j];
                l++;
            }

            helper[i]=isTrue(arr,k);
        }
        return helper;
    }
    private static int isTrue(int[] arr,int k){
        
        
        int min=arr[0];
        if(k<2) return min;
        int max=arr[0];
        // int trueMax=arr[0];
        for(int i=1;i<k;i++){
            if(arr[i]<arr[i-1]) return -1;
            if(Math.abs(arr[i]-arr[i-1])!=1) return -1;
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
            // trueMax=Math.max(trueMax,arr[i]);
        }
        if(min==max) return -1;
        return max;
    }
}
