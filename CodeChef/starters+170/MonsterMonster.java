// https://www.codechef.com/problems/KO_MON

public class MonsterMonster {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long x=sc.nextLong();
		    long[] a=new long[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextLong();
		    }
		    
            System.out.println(helper(a,n,x));
		    
		}

	}
	private static long helper(long []a,int n,long x){
	    Arrays.sort(a);
	    descending(a,n);
	    long max = 0;
	   // int j=0;
        for(int i=0;i<n;i++) {
            long h=a[i]+i*x;
            max=Math.max(max,h);
            // j++;
        }
        return max;
	}
	private static void descending(long[] a,int n){
	    for (int i = 0; i < n/ 2; i++) {  
            long temp = a[i];  
            a[i] = a[n - 1 - i];  
            a[n - 1 - i] = temp;  
        }  
        Arrays.toString(a); 
	}
}
