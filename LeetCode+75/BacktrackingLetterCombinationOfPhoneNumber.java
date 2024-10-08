/*
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]
 
Constraints:
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 */

import java.util.ArrayList;
import java.util.List;

public class BacktrackingLetterCombinationOfPhoneNumber {
    private static final String[] KEYPAD = {"","", "abc","def","ghi","jkl","mno", "pqrs","tuv","wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        backtrack(result, new StringBuilder(), digits, 0);
        
        return result;
    }
    private void backtrack(List<String> result, StringBuilder currentCombination, String digits, int index) {
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = KEYPAD[digit - '0'];
        
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);         
            backtrack(result, currentCombination, digits, index + 1);  
            currentCombination.deleteCharAt(currentCombination.length() - 1); 
        }
    }
}
