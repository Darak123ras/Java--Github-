// https://www.codechef.com/problems/ARRAYSTATE

public class FindMultisetState {


    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] a=new int[n];
		  //  List<Integer> list = new ArrayList<>();
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		      //  list.add(a[i]);
		    }
		    int i=0;
		    int j=n-1;
		    while(k>0){
		        if(i==j) break;
		        int sum=a[i]+a[j];
		        a[i]=-1;
		        a[j]=sum;
		        i++;
		        k--;
		    }
		    for(;i<=j;i++){
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}

	}
    // Time Limit Exceeded
    // public static void main (String[] args) throws java.lang.Exception
	// {
        
	// 	Scanner sc=new Scanner(System.in);
	// 	int t=sc.nextInt();
	// 	while(t-->0){
	// 	    int n=sc.nextInt();
	// 	    int k=sc.nextInt();
	// 	    int[] a=new int[n];
	// 	    List<Integer> list = new ArrayList<>();
	// 	    for(int i=0;i<n;i++){
	// 	        a[i]=sc.nextInt();
	// 	        list.add(a[i]);
	// 	    }
		    
	// 	    while(k>0){
	// 	        multiset(list);
	// 	        k--;
	// 	    }
	// 	    for(int i:list){
	// 	        System.out.print(i+" ");
	// 	    }
	// 	    System.out.println();
	// 	}

	// }
	// private static List<Integer> multiset(List<Integer> list){
	//     Collections.sort(list);
	//    int n=list.size();
	//     int x=list.get(0);
	//     int y=list.get(n-1);
	//     int newElement=x+y;
	//     list.remove(0);
	//     list.remove(list.size()-1);
	//     list.add(newElement);
	    
	//     return list;
	// }
}
