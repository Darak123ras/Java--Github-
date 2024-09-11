/*
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */

public class ReverseVowelOfString {
    public String reverseVowels(String s) {
        // char[] vowel={'a','e','i','o','u'};
        int n=s.length();
        if(n==0) return s;
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            boolean vowelI=false;
            boolean vowelJ=false;
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'){
                vowelI=true;
            }
            if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u' || ch[j]=='A' || ch[j]=='E' || ch[j]=='I' || ch[j]=='O' || ch[j]=='U'){
                vowelJ=true;
            }
            

            if(vowelI==true && vowelJ==true){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }else if(vowelI==true){
                j--;
            }else if(vowelJ==true){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return new String(ch);
        
    }
}
