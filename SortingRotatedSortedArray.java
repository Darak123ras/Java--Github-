/*
 * Problem statement
Given a rotated sorted array of size ‘N’ and let the elements of the given array be a1,a2,......,an . 
You need to sort the given array in increasing order.

For Example - Consider ‘N’ = 4 and the given array is [2,3,4,1] then the output should be [1,2,3,4].

A rotated sorted array is a sorted array in which each element is shifted ‘x’ (‘x’ >= 0 and ‘x’ <= ’N’) 
times to its right and the rightmost element is shifted to the beginning of the array.

For Example - [3,4,1,2] is a rotated sorted array in which each element is shifted two times to its right.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 50
1 <= N <= 10^4
-10^9 <= a[i] <= 10^9 

Where ‘T’ is the total number of test cases, ‘N’ is the size of the array and a[i] is an element of the array.

Time Limit: 1 sec
Sample Input 1 :
2
5
6 8 9 2 3
6
7 8 9 1 3 5
Sample Output 1 :
2 3 6 8 9
1 3 5 7 8 9
Explanation of Sample Input 1 :
Test case 1 :
The given array [6,8,9,2,3] is rotated around index 3 so the required array after sorting will be [2,3,6,8,9].

Test case 2 :
The given array [7,8,9,1,3,5] is rotated around index 3 so the required array after sorting will be [1,3,5,7,8,9].
Sample Input 2 :
2
6
9 1 3 5 7 8
4
4 5 2 3
Sample Output 2 :
1 3 5 7 8 9
2 3 4 5
 */
// Adobe, Hike, Unthinkable Solution
public class SortingRotatedSortedArray {
    private static void swap(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
    }
    public static void sortRotatedArray(int[] arr, int n) {
        // Write your code here.
        if(n==0 || n==1) return;
        
        int i=1;
        int k=0;
        while(i<n){
            int j=i-1;
            if(arr[j]>arr[i]){
                k=i;
                break;
            }
            i++;
        }
        if(k!=0 || k!=n-1){
            swap(arr,0,k-1);
            swap(arr,k,n-1);
        }
        swap(arr,0,n-1);

    }
}
