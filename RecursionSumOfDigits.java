/*
 * Problem statement
Write a recursive function that returns the sum of the digits of a given integer.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^9
Sample Input 1 :
12345
Sample Output 1 :
15
Sample Input 2 :
9
Sample Output 2 :
9
 */

import java.util.Scanner;

public class RecursionSumOfDigits {
    public static int sumOfDigits(int input){
		// Write your code here
		if(input ==0){
			return 0;
		}
		int rem=input%10;
		return rem+sumOfDigits(input/10);
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(RecursionSumOfDigits.sumOfDigits(n));
        s.close();
	}
}
