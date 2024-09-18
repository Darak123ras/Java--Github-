/*
 * Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

Note: The driver code prints "balanced" if function return true, otherwise it prints "not balanced".

Examples :

Input: {([])}
Output: true
Explanation: { ( [ ] ) }. Same colored brackets can form balanced pairs, with 0 number of unbalanced bracket.
Input: ()
Output: true
Explanation: (). Same bracket can form balanced pairs,and here only 1 type of bracket is present and in balanced way.
Input: ([]
Output: false
Explanation: ([]. Here square bracket is balanced but the small bracket is not balanced and Hence , the output will be unbalanced.
Expected Time Complexity: O(|x|)
Expected Auixilliary Space: O(|x|)

Constraints:
1 ≤ |x| ≤ 105
 */

import java.util.Stack;

public class StackParanthesesChecker {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
