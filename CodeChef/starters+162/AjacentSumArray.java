/*https://www.codechef.com/START162D/problems/ADJSUMLOST */

import java.util.*;

public class AjacentSumArray{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int []b=new int[n-1];
		    for(int i=0;i<n-1;i++){
		        b[i]=sc.nextInt();
		    }
		    Arrays.sort(b); 

            int[] a = new int[n];
            a[0] = (int)Math.floor((double)b[0]/2); 
            for (int i = 1; i < n; i++) {
                a[i] = b[i-1] - a[i - 1]; 
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
		    
		}
        sc.close();

	}
}