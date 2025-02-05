// https://www.codechef.com/problems/SMLPAL

public class SmallPalindrome {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();//1
		    int y=sc.nextInt();//2
		    smallestPalindrome(x,y);
		  //  if(x==0 && y==0){
		  //      System.out.println("")
		  //  }
		  //  else if(y==0){
		  //      String palindrome="";
		  //      while(x>0){
		  //          palindrome+="1";
		  //          System.out.println(palindrome);
		  //          x--;
		  //      }
		  //  }else if(x==0){
		  //      String palindrome="";
		  //      while(y>0){
		  //          palindrome+="2";
		  //          System.out.println(palindrome);
		  //          y--;
		  //      }
		  //  }else{
		  //      if(x>y){
		            
		  //      }
		  //  }
		}

	}
	private static void smallestPalindrome(int x,int y){
	    String palindrome = new String();
        y/=2;
        x/=2;
        // for (int i=0;i<y;i++) {
        //     palindrome+="2";
        // }
        
        for (int i=0;i<x;i++) {
            palindrome+="1";
        }
        
        for (int i=0;i<y;i++) {
            palindrome+="2";
        }
        StringBuilder sb = new StringBuilder(palindrome);
        
        System.out.println(palindrome+sb.reverse().toString());
	}
}
