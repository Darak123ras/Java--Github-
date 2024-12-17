/*
 * https://www.codechef.com/problems/BINARYSUM
 */

import java.util.Scanner;

public class BinarySum {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    if((n/2)==k || (n+1)/2==k) System.out.println("YES");
		    else System.out.println("NO");
		}
        sc.close();
		

	}
}
