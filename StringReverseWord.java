/*
 * Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

Note: The last character has not been '.'. 

Examples :

Input: str = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
Input: str = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole string , the input string becomes mno.pqr
Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 <= |str| <= 105
 */
// Paytm, Accolite, Amazon, Microsoft, Samsung, MakeMyTrip, Goldman Sachs, Adobe, SAP Labs, Cisco
public class StringReverseWord {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        if(str.length()==0) return str;
        String []arr=str.trim().split("\\.");
        if(arr.length==1) return str;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return String.join(".",arr);
    }
}
