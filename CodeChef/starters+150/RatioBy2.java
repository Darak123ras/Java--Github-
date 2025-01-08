// https://www.codechef.com/problems/RATIO2

public class RatioBy2 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    
		    if(x>=2*y || y>=2*x) {
		        System.out.println(0);
		        continue;
		    }
		    int newX=helper(x,y);
		    int newY=helper(y,x);
		    System.out.println(Math.min(newX,newY));
		}

	}
	private static int helper(int x,int y){
	    int min=0;
	    while(x-2*y<0){
		        min+=1;
		        y-=1;
		    }
		    return min;
	}
}
