// https://www.codechef.com/problems/SPC2025Q2

import java.util.*;

public class ItzSimple {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            int[] a=new int[n];
            int max=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
                max=Math.max(max,a[i]);
            }
            sum-=max;
            if(sum+p>max+k) System.out.println("Varun");
            else if(sum+p<max+k) System.out.println("Ved");
            else System.out.println("Equal");
        }
        sc.close();
	}
}
