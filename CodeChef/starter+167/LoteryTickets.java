// https://www.codechef.com/problems/LOTTERYTICK?tab=statement

public class LoteryTickets {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
		    int x = a[0];
            Arrays.sort(a);
            long ans = 0;
            int i;
    
            for (i = 0; i < n; i++) {
                if (a[i] == x) {
                    break;
                }
            }
    
            if (i == 0) {
                ans += a[i];
                ans += (a[i + 1] - a[i]) / 2;
                ans--;
            } else if (i == n- 1) {
                ans += (1000000 - a[i]);
                ans += (a[i] - a[i - 1]) / 2;
            } else {
                ans += (a[i + 1] - a[i]) / 2;
                ans += (a[i] - a[i - 1]) / 2;
            }
    
            ans++;
            System.out.println(ans);
		    
		}

	}
}
