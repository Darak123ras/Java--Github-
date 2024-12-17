/*
 * https://www.codechef.com/problems/MINBUY
 */

import java.util.Arrays;
import java.util.Scanner;

public class MinimumTypes {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
            int k=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=sc.nextInt();
		        b[i]=b[i]*a[i];
		    }
		    Arrays.sort(b);
		    int c=0;
		    int sum=0;
		    for(int i=n-1;i>=0;i--){
		        sum+=b[i];
		        c++;
		        if(sum>=k){
		            break;
		        }
		    }
		    if(c==n && sum<k)
		        System.out.println(-1);
		    else
		        System.out.println(c);
		}
        sc.close();
	}
}
