/*
 * Problem statement
You are given a natural number ‘N’. Find all the divisors of the number ‘N’. Print them in increasing order.

Example:
Input: ‘N’ = 10 

Output: [1, 2, 5, 10]

1, 2, 5, and 10 are the only divisors of the number 10.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N <= 10^9

Time Limit: 1 sec
Sample Input 1 :
2
100
13
Sample Output 1 :
1 2 4 5 10 20 25 50 100
1 13
Explanation Of Sample Input 1 :
For the first case:
100 is divisible by 1 2 4 5 10 20 25 50 100 only.

For the second case:
13 is divisible by 1 and 13 only.
Sample Input 2 :
2
125
15
Sample Output 2 :
1 5 25 125 
1 3 5 15
 */

public class DivisorsOfNaturalNumber {
    public static ArrayList<Integer> getAllDivisors(int n){
		// Write your code here.
		ArrayList<Integer> list=new ArrayList<>();
		if(n==0) return list;
		int x=(int)Math.sqrt(n);
		int i=1;
		while(i<=x){
			if(n%i==0) {
				list.add(i);
				if(i!=(n/i)){
					list.add(n/i);
				}
			}
			i++;
		}
		Collections.sort(list);
		return list;
	}
}
