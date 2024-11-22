/*
 * Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.
Input: prices[] = [7, 6, 4, 3, 1]
Output: 0 
Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.
Input: prices[] = [1, 3, 6, 9, 11]
Output: 10 
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].
Constraint:
1 <= prices.size()<= 105
0 <= prices[i] <=104
 */
// Google, Goldman Sachs, Amazon, Nvidia, PayPal, Yahoo, Oracle, Zoho, Apple, Uber, Accenture, Walmart
// Microsoft, Facebook, IBM, Samsung, Adobe, TCS, Intel, Infosys, Visa


public class StockBuyAndSell {
    public int maximumProfit(int prices[]) {
        // Code here
        int stock=0;
        int n=prices.length;
        if(n==0 || n==1) return 0;
        
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i:prices){
            min=Math.min(min,i);
            int curr=i-min;
            max=Math.max(max,curr);
            
        }
        
        return max;
    }
}
