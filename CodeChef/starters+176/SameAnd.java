// https://www.codechef.com/problems/SAME_AND

public class SameAnd {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            solve(n,m);
        }
        scanner.close();
	}
	private static void solve(long n,long m){
            List<Long> list = new ArrayList<>();
            list.add(n);
            int len=63;
            for(int i=0; i<len;i++) {
                if(((n>>i)&1L)==1L) continue;
                long c=n+(1L<<i);
                if(c<=m) {
                    list.add(c);
                }
            }
            int size=list.size();
            if(size<2){
                System.out.println(-1);
            } else {
                System.out.println(size);
                for(int i=size-1;i>=0;i--) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            }
        
	}
}
