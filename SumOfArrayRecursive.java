/*
 * Problem statement
Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7 
 */

import java.util.Scanner;

public class SumOfArrayRecursive {
    public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return sumHelper(input,input.length,0);
	}
	private static int sumHelper(int []ar,int n,int i){
		// if(n==0) return 0;
		if(i==n) return 0;
		return ar[i]+sumHelper(ar, n, i+1);
	
    }
    static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(SumOfArrayRecursive.sum(input));
	}
}
