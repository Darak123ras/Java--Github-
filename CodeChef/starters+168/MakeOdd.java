// https://www.codechef.com/problems/P2P

public class MakeOdd {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String a=sc.next();
		    String b=sc.next();
		    boolean isPossible=false;
		    int countZeroA=0;
		    int countZeroB=0;
		    int score=0;
		    int single=0;
		    
		    for(int i=0;i<n;i++){
		        char c1=a.charAt(i);
		        char c2=b.charAt(i);
		        if(c1=='1'  || c2=='1'){
		            score+=1;
		        }
		        if(c1=='0'){
		            countZeroA+=1;
		        }
		        if(c2=='0'){
		            countZeroB+=1;
		        }
		        
		        
		        if((c1=='0' && c2=='1') || (c1=='1' && c2=='0')) {
		            isPossible=true;
		            single++;
		        }
		        
		    }
		    if(isPossible) {
		        System.out.println("Yes");
		        continue;
		    }
		  //  if(n==1 && (countZeroA!=0 || countZeroB!=0)){
		  //      System.out.println("Yes");
		  //      continue;
		  //  }
		    
		    
		    
		    if(score%2!=0 || single>0) System.out.println("Yes");
		    else{
		        System.out.println("No");
		    }
		    
		    
		}

	}
}
