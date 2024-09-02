/*
 * Problem statement
You are given a string S of words. Your task is to find the number of palindrome words in the given string S. A word is called palindrome, if it reads the same backwards as forwards.

Note:
Words are separated by one or more whitespace characters.
For Example:
For the given string “Madam oyo cat”, “Madam”, and “oyo” are the palindrome words 
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10 
0 <= |S| <= 10^5 

All the characters of the string S contain whitespace, lowercase, and uppercase English letters only.

Time limit: 1 second
Sample Input 1:
1
Nitin and I are good friends
Sample Output 1:
2
Explanation For Sample Input 1:
For the first test case, there are 2 palindrome words only i.e “Nitin” and “I”.
Sample Input 2:
2
Madam taught us the level order traversal of a binary tree yesterday
We love coding ninjas
Sample output 2:
3
0
 */
// Google, Cognizant, Makemytrip


public class CountPalindromeInString {
    public static int countNumberOfPalindromeWords(String s) 
	{
        // Write your code here!
        int len=s.length();
        if(len==0) return 0;
        if(len==1) return 1;
        s=s.toLowerCase();
        String arr[]=s.split(" ");
        int count=0;
        for(String str:arr){
            if(str.length()==1) count++;
            if(str.length()>1 && isPalindrome(str)) {
                count++;
            }
        }
        return count;
    }
    private static boolean isPalindrome(String str){
        int j=0;
        int k=str.length()-1; 
        while(j<k){
            if(str.charAt(j)!=str.charAt(k)) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}
