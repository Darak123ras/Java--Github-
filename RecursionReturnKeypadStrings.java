/*
 * Problem statement
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.

Return empty string for numbers 0 and 1.

Note :
1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10^6

Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
 */

import java.util.ArrayList;

public class RecursionReturnKeypadStrings {
    // Return a string array that contains all the possible strings
	private static String[] num={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static String[] keypad(int n){
		// Write your code here
		if(n==0) return new String[]{""};
		ArrayList<String> list=new ArrayList<>();
		helper(n,list);
		String[] str = new String[list.size()];  
        for (int i = 0; i < list.size(); i++) {  
            str[i] = String.valueOf(list.get(i));  
        }
		return str;
	}
	private static void helper(int n,ArrayList<String> list){
		if(n==0 || n==1) {
			list.add("");
			return ;
		}
		int rem=n%10;
		n/=10; 
		ArrayList<String> smallOutput=new ArrayList<>();
		helper(n, smallOutput);
		String letters = num[rem];
		for (char ch : letters.toCharArray()) {
            for (String s : smallOutput) {
                list.add(s + ch);
			}
		}
	}
}
