/*
 * https://www.codechef.com/problems/CHEFSOCKS
 */

import java.util.Scanner;

public class ChefAndSocks{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); // needs a dollars
		int x=sc.nextInt(); // has x dollars
		int y=sc.nextInt(); // given additional y dollars
		// (x+y)
		if((x+y)>=a) System.out.println("YES");
		else System.out.println("NO");
        sc.close();

	}
    
 }