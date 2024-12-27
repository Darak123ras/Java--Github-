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

var moveZeroes = function(nums) {
    let n=nums.length;
    if(n<=1) return;
    let i=0;
    let j=i+1;
    while(i<n && j<n){
        if(nums[i]==0 && nums[j]!=0){
            let temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j++;
        }else if((nums[i]==0 && nums[j]==0 ) || (nums[i]!=0 && nums[j]!=0)){
            j++;
        }
        // else{
        //     i++;
        // }
        else if(nums[i]!=0 && nums[j]==0){
            i=j;
            j=i+1;
        }
    }

};