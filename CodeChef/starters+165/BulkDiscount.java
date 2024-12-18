// https://www.codechef.com/problems/BDISC

public class BulkDiscount {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] ar=new int[n];
		    for(int i=0;i<n;i++){
		        ar[i]=sc.nextInt();
		        
		    }
		    Arrays.sort(ar);
		    int minCost=0;
		  //  int reduce=1;
		    for(int i=0;i<n;i++){
		        int discount=Math.max(ar[i]-i,0);
		        minCost+=discount;
		      //  reduce++;
		    }
		    System.out.println(minCost);
		}

	}
}
