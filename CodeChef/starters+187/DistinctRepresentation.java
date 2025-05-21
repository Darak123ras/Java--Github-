// https://www.codechef.com/START187B/problems/DIREP

public class DistinctRepresentation {
    final static int MAX=200005;
    static int[] dp=new int[MAX];
    final static int MOD=998244353;
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		helper();
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    String s=sc.next();
		    System.out.println(solution(s,n));
		    
		}
		sc.close();

	}
	private static long solution(String s,int n){
	    int i=0;
        long ans=1;
       
        while(i<n){
            int j=i;
            while(j+1<n && s.charAt(j)!=s.charAt(j+1)){
                j++;
            }

            int length=j-i+1;
            if (length >= 4) {
                int m=length-3;
                ans=(ans*dp[m])%MOD;
            }

            i=j+1;
        }
        return ans;
	}
	static void helper() {
        dp[0]=1;
        dp[1]=2;
        dp[2]=3;
        for(int i=3;i<MAX;i++) dp[i]=(dp[i-1]+dp[i-3])%MOD;
        
    }
}
