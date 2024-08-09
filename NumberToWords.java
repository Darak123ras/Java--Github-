/** 
Problem statement
You are given an Integer ‘N’ you have to convert the integer to words.
For example you are given integer N = 2234 then you have to return the string “two thousand two hundred and thirty four”.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 100
1 <= N <= 999999999
Time Limit: 1 sec
Sample Input 1 :
3
1234
45821
555093
Sample Output 1 :
one thousand two hundred and thirty four
forty five thousand eight hundred and twenty one
five lakh fifty five thousand and ninety three
Explanation of Sample Input 1 :
For the first test case:
The given integer is 1234 we can see that in words it is represented as “one thousand two hundred and thirty four”.

For the second test case:
The given integer is 45821; we can see that in words it is represented as “forty five thousand eight hundred and twenty-one”.

For the third test case
The given integer is 555093; we can see that in words it is represented as “five lakh fifty five thousand and ninety three”.
Sample Input 2 :
3
99999
1000
30000 
Sample Output 2 :
ninety nine thousand nine hundred and ninety nine
one thousand  
thirty thousand 
*/
//  Adobe, Apple, Facebook, Microsoft, Expedia, Morgan Stanley, Cognizant, OLX, RedBus, Ajio, MindTree

// import java.util.* ;
// import java.io.*; 

public class NumberToWords {
	
	private static final String[] str1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
                                           "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
                                           "seventeen", "eighteen", "nineteen"};
    private static final String[] str10 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", 
                                           "eighty", "ninety"};
    // private static final String[] str100 = {"", "thousand", "lakh", "crore"};
	public static String handleAll(long n) {
		 //Write your code here
		StringBuilder sb = new StringBuilder();
        // Finding coefficients of crore,lakh,thousand and hundreds
        sb.append(convertDigitsUtil((int)(n / 10000000), "crore "));
        sb.append(convertDigitsUtil((int)((n / 100000) % 100), "lakh "));
        sb.append(convertDigitsUtil((int)((n / 1000) % 100), "thousand "));
        sb.append(convertDigitsUtil((int)((n / 100) % 10), "hundred "));

        if ((n > 100) && (n % 100 != 0)) {
            sb.append("and ");

        }
        // Adding remaining 2 digits
        sb.append(convertDigitsUtil((int)(n % 100), ""));
        return sb.toString();
    }

    public static String convertDigitsUtil(int n, String s) {

        String str = "";
        if (n > 19) {
            str += str10[n / 10] +" " +str1[n % 10];
        } else {
            str += str1[n];
        }
        if (n != 0) {
            str +=" "+ s;
        }
        return str;
	}
        
}

