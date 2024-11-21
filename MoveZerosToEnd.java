/*
 * Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.
Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105
 */
// PayTm, Amazon, Microsoft, Samsung, SAP Labs, LinkedIn, BloomBerg

public class MoveZerosToEnd {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        if(n<2) return;
        int i=0,j=i+1;
        while(i<j && j<n){
            
            if(arr[i]==0 && arr[j]!=0 ){
                swap(arr,i,j);
            }
            else if(arr[i]==0 && arr[j]==0){
                j++;
                continue;
            }
            
                i++;
                j++;
                
        }
        
    }
    void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}