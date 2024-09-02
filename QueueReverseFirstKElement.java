/*
 * Problem statement
You have been given a queue and an integer ‘K’. You need to reverse the order of the first ‘K’ elements of the queue.

Note :
The relative order of other elements should be maintained.
For example :
If Q = [ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 ]
and ‘K’ = 4 
then the output will be
Q = [ 40, 30, 20, 10, 50, 60, 70, 80, 90, 100]
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 100
1 <= N <= 100
0 <= DATA <= 10 ^ 4
0 <= K <= N

Where ‘T’ is the number of test cases, ‘N’ is the size of the queue, “DATA” is the value of the element of the queue and ‘K’ is the number of elements to be reversed.

Time limit: 1 sec.
Sample Input 1:
1
10
10 20 30 40 50 60 70 80 90 100
4
Sample Output 1:
40 30 20 10 50 60 70 80 90 100
Sample Input 2:
1
10
10 20 30 40 50 60 70 80 90 100
3
Sample Output 2:
30 20 10 40 50 60 70 80 90 100
 */
// Goldman Sachs, Cvent, DeltaX

import java.util.Queue;

public class QueueReverseFirstKElement {
    public static void reverse(Queue<Integer> queue, int k){
        // Write your code here.
        int arr[]=new int[k];
        if(k==0 || k==1 || queue.isEmpty() || k>queue.size()) return;
        // took k elements and stored it in array
        for(int i=0;i<k;i++){
            arr[i]=queue.poll();
        }
        // reverse array
        int i=0,j=k-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        int m=0;
        while(m<k){
            queue.add(arr[m]);
            m++;
        }
        // int l=k;
        int size=queue.size();
        int rem=size-k;
        while(rem!=0){
            int temp=queue.poll();
            queue.add(temp);
            rem--;

        }
    }
}
