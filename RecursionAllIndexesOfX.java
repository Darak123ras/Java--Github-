/*
Problem statement
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in the output array (in increasing order).

Do this recursively. Indexing in the array starts from 0.

Hint:
Try making a helper function with the required arguments and call the helper function from the allIndexes function.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
 */

import java.util.Scanner;

public class RecursionAllIndexesOfX{
    private static int countOccurance(int[] a,int x,int i,int count){
        // if(a.length==0) return 0;
        if(i==a.length) return 0;
        // if(a[i]==x) return 1;
        // else return 0;
        return (a[i]==x? 1:0)+countOccurance(a, x, i+1, count);
    }

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int count=countOccurance(input, x,0, 0);
        int n=input.length;
        int[] ar = new int[count];
        if(n==0) return ar;
        
        
        allIndexesHelper(input, x,0,ar,0);
        return ar;
	}
    private static void allIndexesHelper(int[] input,int x,int i,int[] ar,int j){
        // if(input.length==0 ) return;
        if(i>=input.length) return;
        
        if(input[i]==x) {
            ar[j]=i;
            j++;
        }
       allIndexesHelper(input, x,i+1,ar,j);
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
		int output[] = RecursionAllIndexesOfX.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
 }