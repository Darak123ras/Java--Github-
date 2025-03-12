// https://www.codechef.com/problems/XLSL

public class ClothingStore {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int []a=new int[6];
		    for(int i=0;i<6;i++) a[i]=sc.nextInt();
		    System.out.println(helper(a));
		}
		sc.close();

	}
	private static int helper(int[] a){
	    int s=a[0],l=a[1],xl=a[2],ps=a[3],pl=a[4],pxl=a[5];
	    int count=0;
	    while(pxl>0 && xl>0){
	        count++;
	        pxl--;
	        xl--;
	    }
	    while(l>0 && pl>0){
	        count++;
	        l--;
	        pl--;
	    }
	    while(s>0 && ps>0){
	        count++;
	        ps--;
	        s--;
	    }
	    while(pl>00 && xl>0){
	        count++;
	        xl--;
	        pl--;
	    }
	    while(l>0 && ps>0){
	        count++;
	        ps--;
	        l--;
	    }
	    while(ps>0 && xl>0){
	        count++;
	        ps--;
	        xl--;
	    }
	    return count;
	    
	}
}
