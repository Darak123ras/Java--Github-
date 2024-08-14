/*
 * You are given two strings str1 and str2. Your task is to find the length of the longest common substring 
 * among the given strings.
Examples:

Input: str1 = "ABCDGH", str2 = "ACDGHR"
Output: 4
Explanation: The longest common substring is "CDGH" which has length 4.
Input: str1 = "ABC", str2 = "ACB"
Output: 1
Explanation: The longest common substrings are "A", "B", "C" all having length 1.
Expected Time Complexity: O(n*m).
Expected Auxiliary Space: O(n*m).

Constraints:
1<= str1.size(), str2.size()<=1000
Both strings may contain upper and lower case alphabets.
 */

import java.io.*;
// import java.util.*;

public class LongestCommonSubstringDP {
    public int longestCommonSubstr(String str1, String str2) {
        // code here
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxLength;
    }
    public static void main(String args[]) throws Exception {
        // code here
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(read.readLine());

       while (t-- >0) {
            String s1=read.readLine().trim();
            String s2=read.readLine().trim();

            LongestCommonSubstringDP ob=new LongestCommonSubstringDP();
            System.out.println(ob.longestCommonSubstr(s1,s2));
        }

    }
    
}
