/*
 * Problem statement
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.

Do this recursively. Indexing in the array starts from 0.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8
Sample Output :
1
 */

import java.util.Scanner;

public class RecursionFirstIndex {
    public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int n=input.length;
		if(n==0) return -1;
		return firstIndexHelper(input,n,0,x);
	}
	private static int firstIndexHelper(int ar[],int n,int i,int x){
		if(i>=n) return -1;
		if(ar[i]==x) return i;
		return firstIndexHelper(ar, n, i+1, x);
	}
    static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(RecursionFirstIndex.firstIndex(input, x));
	}
}
