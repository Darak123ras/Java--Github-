/*
 * Given two numbers a and b. The task is to find out their LCM.

Examples:

Input: a = 5, b = 10
Output: 10
Explanation: LCM of 5 and 10 is 10
Input: a = 14, b = 8
Output: 56
Explanation: LCM of 14 and 8 is 56
Constraints:
1  <=  a , b  <=  103
 */


public class LCM {
    public static int gcd(int a, int b) {
        // Euclidean Algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b){

        //write your code here
        //return LCM of a and b
        return (a / gcd(a, b)) * b;
        
        
    }
}
