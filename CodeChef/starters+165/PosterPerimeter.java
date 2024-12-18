/* https://www.codechef.com/problems/POSTPERI */

public class PosterPerimeter {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int k=sc.nextInt();
		    
		    int min=Integer.MAX_VALUE;
		    for(int i=1;i<=n;i++){
		        for(int j=1;j<=m;j++){
		            int perimeter=2*(i+j);
		            int diff=Math.abs(perimeter-k);
		            min=Math.min(min,diff);
		        }
		        
		    }
		    System.out.println(min);
		}

	}
}
