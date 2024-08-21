/*
 * Problem statement
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
Note :
using recursion.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= k <= 1000
Sample Input 1 :
3
Sample Output 1 :
1.87500
Sample Input 2 :
4
Sample Output 2 :
1.93750
Explanation for Sample Input 1:
1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.87500
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class RecursionGeometricSum {
    public static double findGeometricSum(int k){
		// Write your code here
		if(k==0) return 1;
		return 1/Math.pow(2,k)+findGeometricSum(k-1);
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = RecursionGeometricSum.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}
