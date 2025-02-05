// https://www.codechef.com/problems/STKSTR

public class StreakStar {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int[] a=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=sc.nextInt();
		    }
		    int max=streak(a); 
            for (int i = 0; i < n; i++) {
                int origi=a[i];
                a[i]*=x;
                int val=streak(a);
                if(max<val) max=val;
                a[i]=origi; 
            }

            System.out.println(max);
		}

	}
	private static int streak(int[] arr) {
        int max=1;
        int curr=1;
        int n=arr.length;
        for(int i=1;i<n;i++) {
            if (arr[i] >= arr[i - 1]) curr++;
            else curr=1;

            max=Math.max(max,curr);
        }
        
        return max;
    }
}
