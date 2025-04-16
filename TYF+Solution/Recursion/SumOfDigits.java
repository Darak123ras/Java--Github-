/*
 * Sum of digits in a given number 
 * 
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.


Examples:
Input : num = 529
Output : 7

Explanation : In first iteration the digits sum will be = 5 + 2 + 9 => 16
In second iteration the digits sum will be 1 + 6 => 7.
Now single digit is remaining , so we return it.

Input : num = 101
Output : 2

Explanation : In first iteration the digits sum will be = 1 + 0 + 1 => 2
Now single digit is remaining , so we return it.

Input : num = 38
Output: 2

0 <= num <= 231 - 1
 */


public class SumOfDigits {
    public int addDigits(int num) {
        //your code goes here
        if(num<10) return num;
        return helper(num,0);
    }
    private int helper(int num,int sum){
        if(num==0){
            
            num=sum;
            sum=0;
            if(num<10) return num;
        }
        sum+=num%10;
        return helper(num/10,sum);
    }
}
