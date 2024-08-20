/*
 * Problem statement
Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

Note: You are not required to print anything, just implement the function. Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
abbba
Sample Output 1:
true
Explanation Of Sample Input 1 :
“abbba” is a palindrome
Sample Input 2:
abcd
Sample Output 2:
false
Explanation Of Sample Input 2 :
“abcd” is not a palindrome.
Constraints:
0 <= |S| <= 10^6
where |S| represents the length of string S.
 */

import java.io.*;
import java.util.*;

public class RecursionPalindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int n=str.length();
        if(n<2) return true;
        return isPalindromeHelper(str,n,0,n-1);
    }
    private static boolean isPalindromeHelper(String s,int n,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalindromeHelper(s, n, i+1, j-1);
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
                    root = new StringTokenizer(br.readLine(), " ");
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

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static FastReader sc = new FastReader();

    private static int t ;
    private static String []str;

    private static void takeInput() {
        t = 1;
        str = new String[t];
        for(int i = 0; i < t; i++){
            str[i] = sc.next();
        }
    }

    // private static void execute() {
    //     for(int i = 0; i < t; i++) {
    //         RecursionPalindrome.isPalindrome(str[i]);
    //     }
    // }

    private static void executeAndPrintOutput() {
        for(int i = 0; i < t; i++){
            boolean ans = RecursionPalindrome.isPalindrome(str[i]);
            if(ans)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

    public static void main(String[] args) {
        takeInput();
        executeAndPrintOutput();
        out.close();
    }
    
}
