/*
 * You are given a string s representing an expression containing various types of brackets: {}, (), and []. Your task is to determine whether the brackets in the expression are balanced. A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order.

Examples :

Input: s = "{([])}"
Output: true
Explanation: 
- In this expression, every opening bracket has a corresponding closing bracket.
- The first bracket { is closed by }, the second opening bracket ( is closed by ), and the third opening bracket [ is closed by ].
- As all brackets are properly paired and closed in the correct order, the expression is considered balanced.
Input: s = "()"
Output: true
Explanation: 
- This expression contains only one type of bracket, the parentheses ( and ).
- The opening bracket ( is matched with its corresponding closing bracket ).
- Since they form a complete pair, the expression is balanced.
Input: s = "([]"
Output: false
Explanation: 
- This expression contains only one type of bracket, the parentheses ( and ).
- The opening bracket ( is matched with its corresponding closing bracket ).
- Since they form a complete pair, the expression is balanced.
Constraints:
1 ≤ s.size() ≤ 106
s[i] ∈ {'{', '}', '(', ')', '[', ']'}
 */
// Google, Flipkart, Microsoft, Walmart, Snapdeal, Oracle, OYO Rooms, Adobe, Amazon

public class ValidParanthesis {
    static boolean isParenthesisBalanced(String s) {
        // code here
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                else if(stack.peek()=='(' && c==')'){
                    stack.pop();
                }else if(stack.peek()=='{' && c=='}'){
                    stack.pop();
                }else if(stack.peek()=='[' && c==']'){
                    stack.pop();
                }else return false;
            }
            
        }
        return stack.isEmpty();
    }
}
