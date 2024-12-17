// https://www.codechef.com/problems/SWAPFLIP

import java.util.*;
public class SwapAndFlip {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
		    // int n=sc.nextInt();
		    String s=sc.next();
		    String t=sc.next();
		    int countOneS = 0, countOneT = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') countOneS++;
            }
            for (char c : t.toCharArray()) {
                if (c == '1') countOneT++;
            }
            if((countOneS%2==0 && countOneT%2==0) || (countOneS%2!=0 && countOneT%2!=0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
		    
		    
		}
		sc.close();

	}
}
