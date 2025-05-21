// https://www.codechef.com/START187B/problems/INCGAME

public class IncrementalGame {
    static int[][][] dp=new int[21][21][41]; 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		for (int[][] arr : dp){
            for (int[] row : arr){
                Arrays.fill(row, -1);
            }
		}
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=sc.nextInt();
		    System.out.println(helper(x,y,k));
		}
		sc.close();
	}
	private static String helper(int x,int y,int k){
	    boolean alice=false;
	    
        for(int i=1;i<=k;i++) {
            if(x>=i && !canBobWin(x-i,y,i)){
                alice=true;
                break;
            }
            if(y>=i && !canBobWin(x,y-i,i)){
                alice=true;
                break;
            }
        }
        return alice?"Alice":"Bob";
	    
	}
	private static boolean canBobWin(int x, int y, int l) {
        if(dp[x][y][l]!=-1){ 
            return dp[x][y][l]==1;
        }

        boolean canWin = false;
        for (int i=l+1;i<= x;i++) {
            if (!canBobWin(x-i,y,i)) {
                canWin = true;
                break;
            }
        }
        for(int i=l+1;i<=y;i++) {
            if (!canBobWin(x,y-i,i)) {
                canWin = true;
                break;
            }
        }
        if(canWin) dp[x][y][l]=1;
        else dp[x][y][l]=0;
        return canWin;
    }
}
