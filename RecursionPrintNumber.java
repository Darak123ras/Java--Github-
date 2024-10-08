/*
 * Problem statement
Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4
 */

import java.util.Scanner;

public class RecursionPrintNumber {
    public static void print(int n){
		//Write your code here
		if(n==0) return;
		// if(n==1) return;
		print(n-1);
		System.out.print(n+" ");
	}
    public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		RecursionPrintNumber.print(n);
        s.close();
	}
}
