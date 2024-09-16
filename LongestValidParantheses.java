/*
 * Given a string str consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.

A parenthesis string is valid if:

For every opening parenthesis, there is a closing parenthesis.
Opening parenthesis must be closed in the correct order.
Examples :

Input: str = ((()
Output: 2
Explaination: The longest valid parenthesis substring is "()".
Input: str = )()())
Output: 4
Explaination: The longest valid parenthesis substring is "()()".
Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 ≤ |str| ≤ 105  
 */
// Google, Microsoft

import java.util.*;
public class LongestValidParantheses {
    static int maxLength(String S){
        // code here
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        
        int maxLength = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            
            if (c == '(') {
                 stack.push(i);
            } else {
                 stack.pop();
                
                if (stack.isEmpty()) {
                     stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}
