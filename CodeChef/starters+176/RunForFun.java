// https://www.codechef.com/problems/RURT

public class RunForFun {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(helper(x,y));
        sc.close();
	}
	private static int helper(int x,int y){
	    y-=x;
	    int count=0;
	    while(y>0){
	        y-=x;
	        count++;
	    }
	    return count;
	}
}
