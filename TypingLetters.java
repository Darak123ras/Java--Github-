/*
You have to type an email to send to your friend. The email can be represented as a string T (which does not contain spaces). 
To complete your task you can perform any one of the following actions in one move:
Append a character at the end of the string.
Append a duplicate of the current string.
Find the minimum number of moves required to type the email.

Input Format
First-line will contain T
T - the number of test cases. Then the test cases follow.
Each test case contains two lines of input.
The first line of every test case contains an integer 
N - the size of the string.
The second line of every test case contains a string 
T of size N.
Output Format
For each testcase, output in a single line - the answer to the i-th test case.

 
The string contains only lowercase english letters
Sample 1:
Input
Output
3
6
oooobj
1
q
5
qqqqr
5
1
4
Explanation:
Test Case 
1
1: We can type the email in the following manner:
o -> oo -> oooo -> oooob -> oooobj

So total of 
5
5 moves are required.

Test Case 
2
2: We need to type a single character, so 
1
1 move is required.
 */

import java.util.Scanner;

public class TypingLetters {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
            StringBuilder output = new StringBuilder();
		    int[] dp = new int[n];
            dp[0] = 1;
            
            for (int i = 1; i < n; i++) {
                dp[i] = dp[i - 1] + 1; 
                if ((i + 1) % 2 == 0) { 
                    int mid = (i + 1) / 2;
                    if (s.substring(0, mid).equals(s.substring(mid, i + 1))) {
                        dp[i] = Math.min(dp[i], dp[mid - 1] + 1); 
                    }
                }
            }
            output.append(dp[n - 1]).append("\n");
            System.out.print(output);
		    // int count=1;
		    // int i=1;
		    
		    // while(i<n){
	        //     String result=s.substring(0,i);
	        //     if(2*i<=n && result.equals(s.substring(i,2*i))){
	        //         count++;
	        //         i*=2;
	        //     }else{
	        //         count++;
	        //         i++;
	        //     }
		        
		    // }
		    // System.out.println(count);
		    
		}

	}
}
