/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */


public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1) return;
        int count=0;
        for(int l=0;l<n;l++){
            if(nums[l]==0) count++;
        }
        if(count==0) return;
        int i=0;
        int j=i+1;
        while(i<j &&j<n){
            boolean val=false;
            if(nums[i]!=0) i++;
            if(nums[i]==0 && nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                val=true;
            }
            // else if(nums[i]==0 && nums[j]==0) 
            j++;
            if(val) i++;
        }
        
    }   
}
