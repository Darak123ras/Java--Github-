/*You are given string s. You need to remove the pair of duplicates.
Note: The pair should be of adjacent elements and after removing a pair the remaining string is joined together. 

Examples:

Input: s = "aaabbaaccd"
Output: ad
Explanation: 
Remove (aa)abbaaccd =>abbaaccd
Remove a(bb)aaccd => aaaccd
Remove (aa)accd => accd
Remove a(cc)d => ad
Input: s = "aaaa"
Output: Empty String
Explanation: 
Remove (aa)aa => aa
Again removing pair of duplicates then (aa) 
will be removed and we will get 'Empty String'.
Constraints:
1 <= |s| <= 103 */


public class StackRemovingConsecutiveDuplicates {
    // Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String s) {
        // your code here
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        if(n==0 || n==1) return s;
        stack.push(s.charAt(0));
        for(int i=1;i<n;i++){
            char c=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            if(stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        str.reverse();
        return str.toString();
    }
}
