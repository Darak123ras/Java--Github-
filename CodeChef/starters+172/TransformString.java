// https://www.codechef.com/problems/P4_172


public class TransformString {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
		    String a=sc.next();
		    String b=sc.next();
		    
            System.out.println(helper(a,b,a.length(),b.length()));
            
        }
    }
    
    private static long helper(String a, String b,int n,int m) {
        ArrayList<Integer> indices = new ArrayList<>();

        int j=m-1;
        for (int i=n-1;i>=0;i--) {
            if (j>=0 && a.charAt(i)==b.charAt(j)) {
                indices.add(i+1); 
                j--;
            }
        }

        if(j>=0){
            return -1; 
        }
        Collections.reverse(indices); 

        long sum=indices.stream().mapToLong(Integer::longValue).sum();
        long cost=(long)m*n+(n-m)-((long)m*(m-1)/2)-sum;

        return cost;
    }
}
