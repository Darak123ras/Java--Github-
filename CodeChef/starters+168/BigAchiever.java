// https://www.codechef.com/problems/BIG

public class BigAchiever {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int max=a[0];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        max=Math.max(max,a[i]);
		       if(i==0){
		           a[i]=1;
		           continue;
		       }
		       if(max==a[i]){
		           a[i]=1;
		       }else{
		           a[i]=0;
		       }
		    }
		  //  for(int i=0;i<n;i++){
		       
		  //  }
		    for(int i:a){
		        System.out.print(i+" ");
		    }
		    System.out.println();
		    
		}

	}
}
