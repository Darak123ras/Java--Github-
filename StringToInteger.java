/*
 * Problem statement
Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 < |S| <= 9
where |S| represents length of string S.
Sample Input 1 :
00001231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567
 */

import java.util.Scanner;

public class StringToInteger {
    public static int convertStringToInt(String input){
		// Write your code here
        if(input.length()==0)return 0;
        return Integer.parseInt(input);
        
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(StringToInteger.convertStringToInt(input));
        s.close();
	}
}
