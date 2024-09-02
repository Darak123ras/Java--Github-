/*
 * Problem statement
Given an integer ‘N’ representing the number of pairs of parentheses, Find all the possible combinations of balanced parentheses with the given number of pairs of parentheses.

Note :

Conditions for valid parentheses:
1. All open brackets must be closed by the closing brackets.

2. Open brackets must be closed in the correct order.
For Example :

()()()() is a valid parentheses.
)()()( is not a valid parentheses.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 5
1 <= N <= 10
Time Limit : 1 sec.
Sample Input 1 :
2
2
3
Sample Output 1 :
(()) 
()()
((())) 
(()()) 
(())()
()(())
()()()
Explanation for Sample Input 1 :
Test Case 1: 

For 2 pair of parentheses the combinations of balanced parentheses will be (()) ()()

Test Case 2:

For 3 pair of parentheses the combinations of balanced parentheses will be 
((())) (()()) (())() ()(()) ()()()
Sample Input 2 :
2
1
4
Sample Output 2 :
()
(((()))) 
((()())) 
((())()) 
((()))() 
(()(())) 
(()()()) 
(()())() 
(())(()) 
(())()() 
()((())) 
()(()()) 
()(())() 
()()(()) 
()()()()
 */
// Microsoft, Amazon, Swiggy, Salesforce, SAP Laps, Myntra Samsung, Oracle, Walmart, MakeMyTrip, TCS, Flipkart
// Goldman Sachs, Accenture, Cognizant, Intuit, Morgan Stanley, Snap Deal, PayPal, Red Hat, E&Y, Optum, VMWare, Byjus
// Josh Technology, Accolite, Airtel, RedBus, Big Basket, Dell, Capegemini, Wipro, Nagaaro, jio 

import java.util.ArrayList;
import java.util.List;

public class BacktrackingBalancedParenthesis {
    public static List<String> balancedParantheses(int n) {
		// Write your code here
		List<String> list=new ArrayList<>();
		balancedParanthesesHelper(list,"",0,0,n);
		return list;
	}
	private static void balancedParanthesesHelper(List<String> list,String str, int i, int j, int n){
		if(str.length()==2*n) {
			list.add(str);
			return;
		}
		if(i<n){
			balancedParanthesesHelper(list,str+"(",i+1,j,n);
		}
		if(j<i){
			balancedParanthesesHelper(list,str+")",i,j+1,n);
		}
	}
}
