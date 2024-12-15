/*
 * Given an integer n. Write a program to find the first prime number greater than n.

Examples:

Input: n = 15
Output: 17
Explanation: 17 is next prime number.
Input: n = 7
Output: 11
Explanation: 11 is the prime number next to 7.
Constraints:
1 <= n <= 500
 */


    public class NextPrime {
        private static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
    }
    public static int nextPrime(int n){
        
            
        //code here to find next prime number
        //return next prime number
        int candidate = n + 1; 
            while (true) {
                if (isPrime(candidate)) {
                    return candidate; 
                }
                candidate++;
            }
    
        
    }
}
