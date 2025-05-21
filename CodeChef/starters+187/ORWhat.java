// https://www.codechef.com/START187B/problems/PORX

public class ORWhat {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int[] list=solution(n,x);
		    for(int j=1;j<list.length;j++)
		        System.out.print(list[j]+" ");
	        System.out.println();
		}
		sc.close();

	}
	private static int[] solution(int n,int x){
	    int[] res=new int[n+1]; // 1-based index
        boolean[] used=new boolean[n+1];

        for(int i=1;i<=n;i++) {
            int val=x^i;
            if(val>=1 && val<=n && !used[val] && (val|i)==x) {
                res[i]=val;
                used[val]=true;
            }
        }

        int next=1;
        for(int i=1;i<=n;i++) {
            if(res[i]==0){
                while(used[next]){
                    next++;
                }
                res[i]=next;
                used[next]=true;
            }
        }
        return res;
	}
}
