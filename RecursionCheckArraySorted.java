/*
 * Problem statement
You are given an array ‘A’ of length ‘N’ , determine whether the array is sorted in non-decreasing order or not.



Example:
Input:
A = [1, 3, 6, 10]
Output:
True
Explanation: Since array ‘A’ is sorted, therefore output is ‘True’.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5
10 20 30 20 40
Sample Output 1:
False
Explanation Of Sample Input 1:
A = [10, 20, 30, 20, 40]
Since array ‘A’ is not sorted, therefore output is ‘False’.
Sample Input 2:
1
1100
Sample Output 2:
True
Constraints:
1 <= N  <= 10^5
1 <= A[i] <= 10^9
 */

import java.io.*;
import java.util.*;

public class RecursionCheckArraySorted {
    public static boolean arraySortedOrNot(int []A, int N) {
        // Write your code here.
        if(N<2) return true;
        return arraySortedOrNotHelper(A, N,0,1);
    }
    private static boolean arraySortedOrNotHelper(int[] ar,int n,int i,int j){
        if(j>n-1) return true;
        if(ar[i]>ar[j]) return false;
        return arraySortedOrNotHelper(ar,n,i+1,j+1);
    }
     public static class FastReader {

        BufferedReader br;
        StringTokenizer root;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (root == null || !root.hasMoreTokens()) {
                try {
                    root = new StringTokenizer(br.readLine());
                } catch (Exception r) {
                    r.printStackTrace();
                }
            }
            return root.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    // private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    private static FastReader sc = new FastReader();

    private static int N;
    private static int []A;

    private static void takeInput() throws IOException {
        N = sc.nextInt();
        A = new int[N];
        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();
    }

    // private static void execute() {
    //     int []Acpy = A.clone();
    //     RecursionCheckArraySorted.arraySortedOrNot(Acpy, N);
    // }

    private static void executeAndPrintOutput() {
        boolean ans = RecursionCheckArraySorted.arraySortedOrNot(A, N);
        if(ans)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String[] args) throws IOException {
        takeInput();
        executeAndPrintOutput();
    }
}
