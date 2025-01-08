/*
 * Ram makes a plan for the new year. He decides to sell the products and writes down the price for n days. The prices are denoted by an array arr[] of n elements. Looking at the sequence he decides that for the ith product, he is going to get a profit that equals to (arrj - arri), where j is the minimum index just greater than i and arrj >= arri. If there is no such j, then his profit will be equal to arri. Find the total profit of Ram. 

Calculate profit for all the products.

Examples:

Input: arr[] = [5, 4, 6, 2, 1]
Output: 12
Explanation: For the above test case, since there are no elements to the right of 6 , 2 , and 1 which are greater than them, they are added to the answer which is now 6 + 2 + 1 = 9. Furthur more, for 5 and 4, 6 is greater than both of them which adds (6 - 5) and (6 - 4) to the answer and makes it 9 + 1 + 2 = 12.
Input: arr[] = [1, 2, 3, 4]
Output: 7
Explanation: For the above test case, since there are no elements to the right of 4 which are greater than them, they are added to the answer which is now 4. Furthur more, for the remaining elements, their immediate right is greater than them. Hence we add 1 + 1 + 1 to the answer and make it 7. Note than for the second addition, we always consider index difference.
Constraints:
1 <= arr.size() <= 105
1 <= arri <= 103
 */

public class StackShopkeeperProfit {
    public static int profit(int V[]) {
        // Your code here
        int n=V.length;
        Stack<Integer> stack=new Stack<>();
        if(n==0) return 0;
        if(n==1) return V[0];
        int profit=0;
        
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<V[i]){
                stack.pop();
            }
        
            if(stack.isEmpty()) {
                profit+=V[i];
            }else profit+=(stack.peek()-V[i]);
            stack.push(V[i]);
        }
        return profit;
    }
}
