/*
 * Problem statement
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.

Do this recursively.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of String S <= 10^6

Sample Input :
abacd
a x
Sample Output :
xbxcd
 */


import java.util.Scanner;

public class RecursionReplaceCharacter {
	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		//  StringBuilder inputBuilder = new StringBuilder(input);
		
		 String str=replaceCharacterHelper(input,0,c1,c2);
		 return str;
	}
	private static String replaceCharacterHelper(String input ,int i, char c1, char c2){
		 if(input.length()==i) return input;
		//  if(input.length()==0) return input;
		 if(input.charAt(i)==c1){
			input = input.substring(0, i) + c2 + input.substring(i + 1);
		 }
		 return replaceCharacterHelper(input,i+1, c1, c2);
		// return str;

	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(RecursionReplaceCharacter.replaceCharacter(input, c1, c2));
        s.close();
	}
}
