/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 */

import java.util.Stack;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;

        Stack<Character> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            stack.push(s.charAt(i));
        }
        int n=t.length();
        for(int i=0;i<n;i++){
            if(stack.isEmpty()) return true;
            if(t.charAt(i)==stack.peek()) stack.pop();
        }
        return stack.isEmpty();
    }
}
