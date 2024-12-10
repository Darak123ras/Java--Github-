/*
 * An array is considered special if every pair of its adjacent elements contains two numbers with different parity.

You are given an array of integer nums and a 2D integer matrix queries, where for queries[i] = [fromi, toi] your task is to check that 
subarray
 nums[fromi..toi] is special or not.

Return an array of booleans answer such that answer[i] is true if nums[fromi..toi] is special.

 

Example 1:

Input: nums = [3,4,1,2,6], queries = [[0,4]]

Output: [false]

Explanation:

The subarray is [3,4,1,2,6]. 2 and 6 are both even.

Example 2:

Input: nums = [4,3,1,6], queries = [[0,2],[2,3]]

Output: [false,true]

Explanation:

The subarray is [4,3,1]. 3 and 1 are both odd. So the answer to this query is false.
The subarray is [1,6]. There is only one pair: (1,6) and it contains numbers with different parity. So the answer to this query is true.
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
1 <= queries.length <= 105
queries[i].length == 2
0 <= queries[i][0] <= queries[i][1] <= nums.length - 1
 */

public class SpecialArrayII {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        int[] prefixSpecial = new int[n];
        for (int i = 1; i < n; i++) {
            prefixSpecial[i] = prefixSpecial[i - 1] + (nums[i] % 2 != nums[i - 1] % 2 ? 1 : 0);
        }

        boolean[] result = new boolean[q];
        for (int i = 0; i < q; i++) {
            int x = queries[i][0];
            int y = queries[i][1];

            if (x == y) {
                result[i] = true;
            } else {
                result[i] = (prefixSpecial[y] - prefixSpecial[x]) == (y - x);
            }
        }

        return result;
    }
    // public boolean[] isArraySpecial(int[] nums, int[][] queries) {
    //     int n=queries.length;

    //     boolean[] parity=new boolean[queries.length];
    //     if(n==0) return parity;
    //     for(int i=0;i<n;i++){
    //         int x=queries[i][0];
    //         int y=queries[i][1];
    //         boolean check=helper(nums,x,y);
    //         parity[i]=check;

    //     }
    //     return parity;

    // }
    // private static boolean helper(int[] ar,int left,int n){
    //     // if(ar[left]==ar[n]) return true;

    //     while(left<n){
    //         int val1=ar[left];
    //         int val2=ar[left+1];
    //         if(val1==val2) return false;
    //         else if(val1%2==0 && val2%2==0) return false;
    //         else if(val1%2!=0 && val2%2!=0) return false;
    //         left++;

    //     }
    //     return true;
    // }
}
