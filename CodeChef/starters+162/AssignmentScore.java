// https://www.codechef.com/START162D/problems/ASSIGNSCORE

import java.util.Scanner;

public class AssignmentScore {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();//total assignment (n+1)
		    int[] arr=new int[n+1];
		    int scored=0;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        scored+=arr[i];
		    }
		    int total=(n+1)*100;
		  //  int neededScore=total-sum;
		    
		    int neededScore=total/2;
		    int canScore=neededScore-scored;
		    if(canScore<0) System.out.println(0);
		    else if( canScore<=100) System.out.println(canScore);
		    else System.out.println(-1);
		    
		    
		}
        sc.close();

	}
}
