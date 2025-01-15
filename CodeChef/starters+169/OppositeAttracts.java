// https://www.codechef.com/problems/P2169

public class OppositeAttracts {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    String t="";
		    for(char c:s.toCharArray()){
		        if(c=='1'){
		            t+="0";
		        }else{
		            t+="1";
		        }
		    }
		    System.out.println(t);
		}
		

	}
}
