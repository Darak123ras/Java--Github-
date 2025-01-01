/* https://www.codechef.com/problems/TEMPBAL?tab=statement */

public class TempratureBalance {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long []a=new long[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextLong();
		    }
		    long prefixSum = 0;
            long totalSteps = 0;
            for (long i: a) {
                prefixSum += i;
                totalSteps += Math.abs(prefixSum);
            }
            System.out.println(totalSteps);
		}

	}
}
