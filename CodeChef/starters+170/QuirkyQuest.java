// https://www.codechef.com/problems/N3AL_

public class QuirkyQuest {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long[] a=new long[n];
		    for(int i=0;i<n;i++){
    	        a[i]=sc.nextLong();
    	    }
		    
            System.out.println(solution(a,n));
		}


	}
	private static long solution(long[] a,int n){
	    Arrays.sort(a);
	    long sum = 0;
        for(int i=0;i<n;i++) {
            sum=sum+a[i];
        }
        
        long result=sum; 
        for(int i=0;i<n;i++) {
            sum=sum-a[i]; 
            long val=sum+(long)Math.pow(i+1,2);
            result = Math.max(result,val);
        }
        long x=n*n;
        result=Math.max(result,x);
        return result;
	}
}
