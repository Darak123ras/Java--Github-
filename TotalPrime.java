/*
 * Problem statement
Write a program to find the total number of a primes number in a given interval.

Given two integers S and E, count all primes between S and E.

Detailed explanation ( Input/output format, Notes, Images )
Constraints
1 <= N <= 100
Sample Input 1 :
2 10
Sample Output 1 :
4
Explanation of Sample Input 1:
The prime numbers between 2 and 10
are 2,3,5 and 7
Sample Input 2 :
2 5
Sample Output 2 :
3
.
 */

import java.util.Scanner;

class CountPrime {
	
	// Write your totalPrime function here
	public  int totalPrime(int s,int e){
		int count=0;
		while(s<=e){
			boolean isPrime=true;
			for(int i=2;i<s;i++){
				if(s%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime) count++;
			s++;
		}
		return count++;
	}
}

public class TotalPrime {
    public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
        sc.close();
	}
    
}
