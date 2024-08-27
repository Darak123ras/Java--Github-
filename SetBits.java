/*
 * Problem statement
Write a program to count the number of 1's in the binary representation of an integer.

Detailed explanation ( Input/output format, Notes, Images )
Constraints
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
Explanation of Sample Input 1:
Binary Representation of 9 is 1001.
Sample Input 2:
13
Sample Output 2:
3
 */
// Google, Amazon, D.E. Shaw

public class SetBits {
    public static int countSetBits(int n) {
		// Write your code here.
		int count=0;
		while(n>0){
			if(n%2!=0) count++;
			n/=2;
		}
		return count;
	}
}
