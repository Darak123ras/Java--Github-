// https://www.codechef.com/practice/course/1to2stars/LP1TO202/problems/COPS?tab=statement

public class CopsAndThiefs {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int m=sc.nextInt();// Number of cops in the 1 to 100 houses
		    int x=sc.nextInt();// Searches 1 house in x Minutes
		    int y=sc.nextInt();// Minutes to search
		    int[] a=new int[m];
		    int maxHouseSearches=y*x;
		    
		    for(int i=0;i<m;i++){
		        a[i]=sc.nextInt();
		    }
		    int count=0;
		    Arrays.sort(a);
		    for(int i=0;i<m;i++){
		        int left=a[i]-maxHouseSearches;
		        int right=a[i]+maxHouseSearches;
		        
		        if(i==0 && left>1){
		            count+=left-1; 
		        } 
		        if(i==m-1 && right<100){
		            count+=(100-right);
		        }
		        if(i<m-1){
		            int l=a[i]+maxHouseSearches+1;
		            int r=a[i+1]-maxHouseSearches-1;
		            if(l<=r) count+=(r-l+1);
		        }
		    }
		    System.out.println(count);
		    
		}

	}
}
