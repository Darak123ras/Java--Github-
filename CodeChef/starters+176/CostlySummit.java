// https://www.codechef.com/problems/LSU

public class CostlySummit {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();// Number of people
		    int c=sc.nextInt();// cost to learn any language
		    
		    String s=sc.next();
		    
		    System.out.println(helper(s,n,c));
		    
		}
		sc.close();

	}
	private static int helper(String s,int n,int c){
	    Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        int len=list.size();
        int[] temp = new int[len+ 1];
        for(int i=0;i<len;i++) {
            temp[i+1]=temp[i]+list.get(i);
        }

        int cost = Integer.MAX_VALUE;

        for (int k=0;k<=len;k++) {
            
            int tCost=(n-temp[k])*((n-temp[k])+1)/2;
            
            int total=k*c+tCost;

            cost=Math.min(cost,total);
        }

        return cost;
	    
	}
}
