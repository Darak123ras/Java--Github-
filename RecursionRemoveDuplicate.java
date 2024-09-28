/*
 * Problem statement
Given a string S, remove consecutive duplicates from it recursively.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
 */
// Cognizant, Adobe, Tech Mahindra, CSI, SAP Labs, PayTM, E&Y, HashedIn

public class RecursionRemoveDuplicate {
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length()<=1) return s;
		String str=removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0)==str.charAt(0)){
			return str;
		}else{
			return s.charAt(0)+str;
		}

	}
}
