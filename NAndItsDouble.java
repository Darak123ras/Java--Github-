/*
 * Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
Example 2:

Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
 

Constraints:

2 <= arr.length <= 500
-103 <= arr[i] <= 103
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NAndItsDouble {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        if(n==0 || n==1) return false;
        if(n==2 && (arr[0]!=2*arr[1] || arr[0]*2!=arr[1])) return false;
        Arrays.sort(arr);
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=0;i<n;i++){
            // int count=1;
            int val=2*arr[i];
            if((val!=arr[i] && map.containsKey(val)) || (val == arr[i] && map.get(val) > 1)) return true;
        }
        // int i=0;
        // while(i<n){
        //     int j=i+1;
        //     while(j<n){
        //         if(arr[i]==2*arr[j] || arr[i]*2==arr[j]) return true;
        //         j++;
        //     }

        //     i++;
        // }
        return false;
    }
}
