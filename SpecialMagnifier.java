/*
 * Problem statement
Ninja has four integers 'A', 'B', 'C', and 'D'.



Your task is to find an integer 'X' '(X > 0)', such that 'A = B * X' and 'C = D * X', if no such 'X' is possible then return '-1'.



Example:
'A' = 4
'B' = 2
'C' = 6
'D' = 3

'X' = 2, will satisfy the condition as '4 (A) = 2 * 2 (B * X)', and '6 (A) = 3 * 2 (B * X)'.
So, the answer is '2'.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
0 <= A <= 10^12
0 <= B <= 10^12
0 <= C <= 10^12
0 <= D <= 10^12

Note: It's guaranteed that not all of 'A', 'B', 'C', and 'D' are 0 at the same time.

Time Limit: 1 second
Sample Input 1:
2
4 0 4 0
3 3 0 0
Sample Output 1:
-1
1
Explanation Of Sample Input 1:
For test case 1:
There is no possible 'X' such that '0 * X' equals '4'.
So, the answer is '-1'.

For test case 2:
'X' = 1, will satisfy the condition as '3 (A) = 3 * 1 (B * X)', and '0 (A) = 0 * 1 (B * X)'.
So, the answer is '1'.
Sample Input 2:
2
0 0 0 10
28 7 28 7
Sample Output 2:
-1
4
 */

public class SpecialMagnifier {
    public static long findMagnifier(long a, long b, long c, long d) {
        // Write your code here
        if(b==0 && d==0) {
            if(a==0 && c==0) return 1;
            else return -1;
        }
        if(b==0){
            if(a==0 && c%d==0) {
                if(c==0) return-1;
                return c/d;
            }
            else return -1;
        }
         if(d==0){
            if(c==0 && a%b==0) {
                if(a==0) return-1;
                return a/b;
            }
            else return -1;
        }
        
        if(a%b==0 && c%d==0){
            long x2=a/b;
            long x1=c/d;
            if(x2==x1) return x2;
        }
        
        return -1;
    }
}
