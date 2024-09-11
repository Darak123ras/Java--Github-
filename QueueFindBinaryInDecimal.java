/*
 * Problem statement
Given an integer ‘N’, the task is to find the number of integers between 1 to N whose decimal number representation contains only 0s and 1s.

For example, 1011 , 11, 100 are all valid integers since they consist of 1s and 0s only, however 210, 3401 are not valid integers.

Note :
You don’t need to print anything. It has already been taken care of. Just implement the given function.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10^4
1 <= N <= 10^9

Time Limit: 1sec
Sample input 1 :
2
10
21
Sample output 1 :
2
3
Explanation for sample input 1 :
In first case, there are only 2 numbers between 1 to 10 that contain only 1s or 0s i.e (1,10)In second case, there are only 3 numbers  containing only 0s and 1s i.e (1,10,11) 
Sample input 2 :
3
250
1505
3010
Sample output 2 :
7
15
15
 */
// Infosys

 import java.util.*;

public class QueueFindBinaryInDecimal {
    public static long countOfNumbers(long n) {
		// Write your code here.
		Queue<Long> queue=new LinkedList<>();
		queue.add(1L);
		long count=0;

		while(!queue.isEmpty()){
			long curr=queue.poll();

			if(curr>n) continue;
			count++;
			long nextZero=curr*10;
			long nextOne=curr*10+1;

			if(nextZero<=n) queue.add(nextZero);
			if(nextOne<=n) queue.add(nextOne);
		}
		return count;
		 
	}
}
