// https://www.codechef.com/START171C/problems/SWISHGAME

public class Swish {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int k=sc.nextInt();
		    int m=sc.nextInt();
		    String s=sc.next();
		    int store=helper(s,0);
		    
		    if(store>=m) System.out.println(k);
		    else{
		        int val=m-store-1;
		        System.out.println(k+val);
		    }
		    
		}
		

	}
	private static int helper(String str,int count){
		    for(char c:str.toCharArray()){
		        if(c=='S') count++;
		    }
		    return count;
		}
}
