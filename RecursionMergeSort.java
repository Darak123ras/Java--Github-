/*
 * Problem statement
You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.



You must sort the elements between 'l' and 'r'.



Note:
Change in the input array itself. So no need to return or print anything.
Example:
Input: ‘N’ = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]

Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Explanation of Sample Output 1:
After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Explanation of Sample Output 2:
After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
Constraints :
1 <= N <= 10^3
0 <= ARR[i] <= 10^9
 */
// Micrsoft, Amdocs

import java.util.Scanner;

public class RecursionMergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l>=r) return;
        if(arr.length<=1) return;
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    private static void merge(int[] arr,int low,int mid,int high){
        if(low>=high) return;
        int len1=mid-low+1;
        int len2=high-mid;
        int[] leftArray=new int[len1];
        int[] rightArray=new int[len2];

        for(int i=0;i<len1;i++){
            leftArray[i]=arr[low+i];
        }
        for(int i=0;i<len2;i++){
            rightArray[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while(i<len1 && j<len2){
            if(leftArray[i]<rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }else{
                arr[k]=rightArray[j];
                j=j+1;
            }
            k++;
        }
        while(i<len1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
         while(j<len2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }

    }
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int input[]) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        RecursionMergeSort.mergeSort(input, 0, input.length - 1);
        printArray(input);
    }
}
