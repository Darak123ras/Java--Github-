// https://www.codechef.com/problems/DELNQ

public class DeleteNotEqual {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    StringBuilder sb=new StringBuilder(s);
		    int ones=0;
		    int zeros=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='0') zeros++;
		        else ones++;
		    }
		    if(ones==0 && zeros!=0) {
		        System.out.println(zeros);
		    }else if(ones!=0 && zeros==0) System.out.println(ones);
		    else if(ones==0 && zeros==0) System.out.println(0);
		    else System.out.println(1);
		}

	}
}
