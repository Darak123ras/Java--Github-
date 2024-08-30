/*
 * Problem statement
Given a string, compute recursively a new string where all 'x' chars have been removed.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:
 */

import java.util.Scanner;

public class RecursiveRemoveX {
    // Return the changed string
	public static String removeX(String input){
		// Write your code here
		// String str="";
		return removeXHelper(input,0,"");
		// return str;
	}
	private static String removeXHelper(String s,int i,String str){
		if(s.length()==i) return str;
		if(s.charAt(i)!='x') {
			str+=s.charAt(i);
		}
		
		return removeXHelper(s,i+1,str);
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(RecursiveRemoveX.removeX(input));
        s.close();
	}
}
