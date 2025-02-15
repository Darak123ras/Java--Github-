/*Given a stack, the task is to sort it such that the top of the stack has the greatest element.

Example 1:

Input:
Stack: 3 2 1
Output: 3 2 1
Example 2:

Input:
Stack: 11 2 32 3 41
Output: 41 32 11 3 2
Your Task: 
You don't have to read input or print anything. Your task is to complete the function sort() which sorts the elements present in the given stack. (The sorted stack is printed by the driver's code by popping the elements of the stack.)

Expected Time Complexity: O(N*N)
Expected Auxilliary Space: O(N) recursive.

Constraints:
1<=N<=100 */
// Amazon, Microsoft, Goldman Sachs, Intuit, Yahoo, IBM, Kuliza



public class StackSort {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        List<Integer> list=new ArrayList<>();
        while(!s.isEmpty()){
            list.add(s.pop());
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            s.push(list.get(i));
        }
        return s;
    }
}
