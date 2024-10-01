/*
 * Problem statement
Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.

Return -1 if x is not present in the given array. Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)

Sample Input :
6
2 3 4 5 6 8 
5 
Sample Output:
3 
Hint : Use helper function to solve this question.
 */

public class RecursionBinarySearch {
    // element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
		if(input.length==0 || (input.length==1 && input[0]!=element)) return -1;
		return helper(input,input.length,0,input.length-1,element);

	}
	private static int helper(int arr[],int n,int i,int j, int num){
		if(i>j || n==0) return -1;
		int mid=(j+i)/2;
		if(num==arr[mid]) return mid;
		else if(num<arr[mid]) return helper(arr,n, i,mid-1,num);
		// else if(num>arr[mid] ) helper( arr,n,mid+1,j,num);
		else return helper( arr,n,mid+1,j,num);
	}
}
