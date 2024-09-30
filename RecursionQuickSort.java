/*
 * Problem statement
Given the 'start' and the 'end'' positions of the array 'input'. 
Your task is to sort the elements between 'start' and 'end' using quick sort.

Note :
Make changes in the input array itself.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 2 3 5 7
Sample Output 2 :
1 2 3 5 7 
Constraints :
1 <= N <= 10^3
0 <= input[i] <= 10^9
 */
// American Express
public class RecursionQuickSort {
    public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(startIndex<endIndex){
			 int pi=partition(input,startIndex,endIndex);
			 quickSort(input,startIndex,pi-1);
			 quickSort(input,pi+1,endIndex);
		 }
	}
	private static int partition(int[] arr,int start,int end){
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end-1;j++){
			if(arr[j]<pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,end);
		return i+1;
	}
	private static void swap(int []arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
