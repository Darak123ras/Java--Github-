/*
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n<2 || k==0) return;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    private static void reverse(int[] a,int i,int j){
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

    //     while(k>0){
    //         helper(nums, n);
    //         k--;
    //     }
    // }
    // private static void helper(int[] arr, int n){
    //     int temp=arr[n-1];
    //     for(int i=0;i<n;i++){
    //         if(i==n-1){
    //             arr[i]=temp;
    //             break;
    //         }
    //         else{
    //             int store=arr[i];
    //             arr[i]=temp;
    //             temp=store;
    //         }
    //     }
    // }
}
