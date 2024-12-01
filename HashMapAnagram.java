/*
 * Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

Note: You can assume both the strings s1 & s2 are non-empty.

Examples :

Input: s1 = "geeks", s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergic"
Output: false
Explanation: Characters in both the strings are not same, so they are not anagrams.
Input: s1 = "g", s2 = "g"
Output: true
Explanation: Character in both the strings are same, so they are anagrams.
Constraints:
1 ≤ s1.size(), s2.size() ≤ 105
 */
// Google, Flipkart, Adobe, Nagaaro

import java.util.HashMap;
import java.util.Map;

public class HashMapAnagram {
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2) return false;
        if(n1==1 && s1.charAt(0)!=s2.charAt(0)) return false;
        Map<Character,Integer> map=new HashMap<>();
        // Map<Character,Integer> map2=new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char c:s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            if(map.containsKey(c)){
                int newValue=map.get(c)-1;
                map.put(c,newValue);
            }
        }
        return true;
        
    }
}
