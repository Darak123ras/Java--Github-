/*
 * https://www.codechef.com/START162D/problems/CALINTAKE
 */

import java.util.Scanner;

public class CalorieIntake {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();//calories per day
		int y=sc.nextInt();//sweets
		int z=sc.nextInt();//sweets calories
		int total=z*y;
		if(total>=x) System.out.println(-1);
		else System.out.println(x-total);
        sc.close();
		

	}
}
