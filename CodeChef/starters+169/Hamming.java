// https://www.codechef.com/problems/P4169


public class Hamming {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] p=new int[n];
		    for(int i=0;i<n;i++){
		        p[i]=sc.nextInt();
		    }
		    if(n==1){
		        System.out.println("Yes");
		        continue;
		    }
		    boolean possible=true;
		    for(int i=0;i<n;i++){
		        int set=countBits(i+1);
		        int val=countBits(p[i]);
		        if(set!=val){
		            possible=false;
		            break;
		        }
		    }
		    System.out.println(possible?"Yes":"No");
		    
		}

	}
	private static int countBits(int n){
	    int count=0;
	    while(n>0){
	        int rem=n%2;
	        if(rem==1) count++;
	        n/=2;
	    }
	    return count;
	}
}
