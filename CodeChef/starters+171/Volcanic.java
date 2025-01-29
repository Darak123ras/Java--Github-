// https://www.codechef.com/START171C/problems/VOLCANO

public class Volcanic {
    static int[] log;
    private static void precompute(int m) {
        m+=1;
        log=new int[m];
        for(int i=2;i<m;i++){
            int k=i/2;
            log[i]=log[k]+1;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		precompute(300001);
		Scanner sc=new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int P = sc.nextInt();
            int[] A = new int[n];
            StringBuilder sb=new StringBuilder();
            int lastV = -1;
            int[] right = new int[n];
            int[] left = new int[n];
            for (int i = 0; i <n; i++) {
                A[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                if (A[i] == 0) lastV = i;
                left[i] = lastV;
            }

            lastV=n;
            
            for(int i=n-1;i>=0;i--) {
                if(A[i]==0) {
                    lastV=i;
                }
                right[i]=lastV;
            }

            if(n==0) {
                sb.append("\n");
                continue;
            }

            int[][] st = table(A, n);
            // int res=

            for (int i=0;i<n;i++) {
                if(A[i]==0){
                    sb.append("0 ");
                    continue;
                }

                List<Integer> possX = new ArrayList<>();

                int lv = left[i];
                int com=-1;
                if (lv!=com) {
                    int ll=lv+1;
                    int lr=i-1;
                    int leftMax=(ll<=lr)?max(st,ll,lr):0;
                    possX.add(Math.max(A[i], leftMax));
                }

                int rv = right[i];
                if (rv!=n) {
                    int rl=i+1;
                    int rr=rv-1;
                    int rightMax=(rl<=rr)?max(st,rl,rr):0;
                    possX.add(Math.max(A[i],rightMax));
                }

                int x=Collections.min(possX);
                int o=(x+P-1)/P;
                sb.append(o);
                sb.append(" ");
            }
            sb.append("\n");
            System.out.print(sb);
        }
	}
    private static int[][] table(int[] A, int n) {
        int x=log[n];
        int l =x+1;
        int[][] st = new int[l][n];
        System.arraycopy(A,0,st[0],0,n);
        for(int k=1;(1<<k)<=n;k++) {
            int prevK=k-1;
            int v=1<<prevK;
            for(int i=0;i+(1<<k)-1<n;i++) {
                st[k][i]=Math.max(st[prevK][i],st[prevK][i+v]);
            }
        }
        return st;
    }
    
    private static int max(int[][] st, int l, int r) {
        if(l>r) {
            return 0;
        }
        int k=log[r-l+1];
        int x=1<<k;
        int maximum=Math.max(st[k][l],st[k][r-x+1]);
        return maximum;
    }
}
