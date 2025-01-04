// https://www.codechef.com/practice/course/1to2stars/LP1TO202/problems/COLGLF2?tab=statement

public class CollegeLifeTwo {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int s=sc.nextInt();//Number of seasons
		    int[] q=new int[s];//Intro Songs
		    long minutes=0;
		    for(int i=0;i<s;i++){
		        q[i]=sc.nextInt();
		    }
		    int k=0;//for iterating through the intro songs q[k].
		    int j=0;
		    while(j<s){
		        int episodes=sc.nextInt();
		      //  int[] duration=new int[episodes];
		        
		        for(int i=0;i<episodes;i++){
		            int duration=sc.nextInt();
		            if(i==0){
		                minutes+=duration;
		                continue;
		            }
		            minutes+=duration-q[k];
		        }
		        k++;
		        j++;
		    }
		    
		    System.out.println(minutes);
		    

		}

	}
}
