// https://www.codechef.com/problems/MINBOTTLES

public class MinimumBottles {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int[] ar=new int[n];
		    double sum=0;
		    for(int j=0;j<n;j++){
		        ar[j]=sc.nextInt();
		        sum+=ar[j];
		    }
		    int total=n*x;
		    if(total==(int)sum) {
		        System.out.println(n);
		        continue;
		    } 
		    System.out.println((int)Math.ceil(sum/x));
		    
		}

	}
}
