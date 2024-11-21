/*
 * You have been given two integer arrays/lists (ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the second array/list (ARR2).


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^6
0 <= M <= 10^6

Time Limit: 1 sec 
Sample Input 1 :
6
2 6 8 5 4 3
4
2 3 4 7 
Sample Output 1 :
2
3 
4
Sample Input 2 :
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
1 
2 
2
 */

package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrintIntersection {
    public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		int n=arr1.length;
		int m=arr2.length;
		if((n==0 && m==0) || m==0 || n==0) return;
		Map<Integer,Integer> map=new HashMap<>();
		for(int num:arr1){
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		ArrayList<Integer> arr=new ArrayList<>();
		for(int nums:arr2){
			if(map.containsKey(nums) && map.get(nums)>0){
				map.put(nums,map.get(nums)-1);
				arr.add(nums);
			}
		}

		for(int num: arr) System.out.println(num);

	}
}
