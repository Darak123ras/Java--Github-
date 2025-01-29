// https://www.codechef.com/START171C/problems/ADVITIYA

public class Advitiya {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    String s=sc.next();
		    String res="ADVITIYA";
		    if(res.equals(s)){
		        System.out.println(0);
		        continue;
		    }
		    
		    System.out.println(helper(s,res,0));
		    
		}

	}
	private static int helper(String s,String res,int st){

        for (int i = 0; i < 8; i++) {
            int x =(res.charAt(i)-s.charAt(i)+26)%26;
            st += x; 
        }
	    return st;
	}
}
