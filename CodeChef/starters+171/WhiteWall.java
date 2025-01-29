// https://www.codechef.com/START171C/problems/WHITEWALL

public class WhiteWall {
    static String[] rgb = {"RGB", "RBG", "GRB", "GBR", "BRG", "BGR"};
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    System.out.println(helper(s,n));
		}
		sc.close();

	}
	public static int helper(String s,int n) {
        int min=Integer.MAX_VALUE;
        int m=rgb.length;
        for(int j=0;j<m;j++){
            String x=rgb[j];
            int change=changes(s,x,n);
            
            if(change<min){
                min=change;
            }
            // min=Math.min(min, changes);
        }

        return min;
    }
    private static int changes(String s,String x,int n){
        int change=0;
        for(int i=0;i<n;i++) {
                if(s.charAt(i)!=x.charAt(i%3)) {
                    change++;
                }
        }
        return change;
    }
}
