/*Problem statement
Given a sequence of numbers ‘ARR’. Your task is to return a sorted sequence of ‘ARR’ in non-descending order with help of the merge sort algorithm.

Example :

Merge Sort Algorithm -

Merge sort is a Divide and Conquer based Algorithm. It divides the input array into two-parts, until the size of the input array is not ‘1’. In the return part, it will merge two sorted arrays a return a whole merged sorted array.

The above illustrates shows how merge sort works.
Note :
It is compulsory to use the ‘Merge Sort’ algorithm.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 50
1 <= N <= 10^4
-10^9 <= arr[i] <= 10^9

Time Limit : 1 sec
Sample Input 1 :
2
7
3 4 1 6 2 5 7
4
4 3 1 2
Sample Output 1 :
1 2 3 4 5 6 7
1 2 3 4
Explanation For Sample Input 1:
Test Case 1 :

Given ‘ARR’ : { 3, 4, 1, 6, 2, 5, 7 }

Then sorted 'ARR' in non-descending order will be : { 1, 2, 3, 4, 5, 6, 7 }. Non-descending order means every element must be greater than or equal to the previse element.

Test Case 2 :

Given ‘ARR’ : { 4, 3, 1, 2 }

Then sorted 'ARR' in non-descending order will be : { 1, 2, 3, 4 }. 
Sample Input 2 :
2
4
5 4 6 7
3
2 1 1
Sample Output 2 :
4 5 6 7
1 1 2 */


public class MergeSort {
    public static void mergeSort(int[] arr, int n) {
		// Write your code here.
		helper(arr,0,n-1);
	}
	private static void helper(int []ar,int low,int high){
		if(low<high){
			int mid=(low+high)/2;
			helper(ar,low,mid);
			helper(ar,mid+1,high);

			merge(ar,low,mid,high);
		}
	}
	private static void merge(int[] arr,int low,int mid,int high){
		int n1=mid-low+1;
		int n2=high-mid;
		int[] left=new int[n1];
		int[] right=new int[n2];
		for(int i=0;i<n1;i++) left[i]=arr[low+i];
		for(int i=0;i<n2;i++) right[i]=arr[mid+1+i];

		int i=0,j=0,k=low;
		while(i<n1 && j<n2){
			if(left[i]<=right[j]) arr[k++]=left[i++];
			else arr[k++]=right[j++];
		}
		while(i<n1) arr[k++]=left[i++];
		while(j<n2) arr[k++]=right[j++];
	}
}
