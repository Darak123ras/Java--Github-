
/*
 * Problem statement
You are given an integer ‘N’, your task is to find and return the N’th Fibonacci number using matrix exponentiation.

Since the answer can be very large, return the answer modulo 10^9 +7.

Fibonacci number is calculated using the following formula:
F(n) = F(n-1) + F(n-2), 
Where, F(1) = F(2) = 1.
For Example:
For ‘N’ = 5, the output will be 5.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= N <= 10^5

Time Limit: 1 sec.
Sample Input 1:
2
10
7
Sample Output 1:
55
13
Explanation For Sample Output 1:
For the first test case, the 10th Fibonacci number is 55.
For the second test case, the 7th Fibonacci number is 13.
Sample Input 2:
2
1
3
Sample Output 2:
1
2
 */
// Amazon, Walmart, Tech Mahindra, HCL, Snapdeal, TCS, Flipkart, Cognizant, Accenture, Oracle, Infosys, EY, Airtel, Wipro, Amdocs
public class Fibonacci {
    private static int mod=1000000007;
    public static int fibonacciNumber(int n){
        // Write your code here.
        // if(n==0) return 0;
        if(n<2) return 1;
    int a=0;
    int b=1;
    int res=0;
        for(int i=2;i<=n; i++){
            res = a+b;
            a=b;
            b=res;
            if(b>mod){
                b=b-mod;
            }
        }
        return b;
    }
}
