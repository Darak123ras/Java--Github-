/*
 * Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices. 
Note: Return an empty list in case of no occurrences of pattern.

Examples :

Input: txt = "abcab", pat = "ab"
Output: [0, 3]
Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3. 
Input: txt = "abesdu", pat = "edu"
Output: []
Explanation: There's no substring "edu" present in txt.
Input: txt = "aabaacaadaabaaba", pat = "aaba"
Output: [0, 9, 12]
Explanation:

Constraints:
1 ≤ txt.size() ≤ 106
1 ≤ pat.size() < txt.size()
Both the strings consist of lowercase English alphabets.
 */
// Microsoft

import java.util.ArrayList;

public class KMPAlgo {
    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> list=new ArrayList<>();
        int p=pat.length();
        int t=txt.length();
        if(p==0 || p>t || t==0) return list;
        int i=0;
        while(i<t){
            if(i+p>t) break;
            String s=txt.substring(i,i+p);
            if(s.equals(pat)){
                list.add(i);
            }
            i++;
        }
        return list;
        
    }
}
