/*
 * https://www.codechef.com/problems/BORROWBOOK
 */

public class ChefLandLibrary {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    Map<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        map.put(a[i],Math.max(map.getOrDefault(a[i],0),i+1));
		    }
		    int sum=0;
		    for(Map.Entry<Integer,Integer> e:map.entrySet()){
		        sum+=e.getValue();
		    }
		    System.out.println(sum);
		}

	}
}
