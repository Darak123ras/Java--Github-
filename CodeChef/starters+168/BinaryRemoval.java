// https://www.codechef.com/problems/BINREM

public class BinaryRemoval {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int k=sc.nextInt();
		    String s=sc.next();
		  //  String helper=new StringBuilder(s).reverse().toString();
		    
		  long zero=0;
		  long one=0;
		  //char ch
		  for(int i=n-1;i>=0;i--){
		      char c=s.charAt(i);
		      if(c=='0') zero++;
		      else one=one+zero;
		  }
		  if(one<=x && one%k==0) System.out.println(1);
		  else System.out.println(2);
		    
		}

	}
}
