// https://www.codechef.com/problems/MSATP

public class FriendlyBinaryStrings {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    sc.nextLine(); 
		    String a = sc.nextLine();
            String b = sc.nextLine();
		   if(solve(n, a, b)) System.out.println("YES");
		   else System.out.println("NO");
		    
		    
		    
		}
		sc.close();

	}
	private static boolean solve(int n,String a,String b){
	    int cnt0 = 0;
	    int cnt1 = 0;
	    int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            char c1=a.charAt(i) ;
            char c2= b.charAt(i);
            if (c1==c2) {
                if (a.charAt(i) == '0') cnt0++; 
                else cnt1++;
            } else {
                cnt2++; 
            }
        }

        if (n % 2 == 0) {
            return (cnt2%2==0 && cnt0%2==0 && cnt1%2==0);
        } else {
            int val=cnt0%2+cnt1%2+cnt2%2;
            if(val==1) return true;
            else return false;
        }
	    
	}
}
