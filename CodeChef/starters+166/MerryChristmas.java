// https://www.codechef.com/problems/MERRYXMAS

public class MerryChristmas {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int total=1+2+4;
		if(x<0) System.out.println(0);
		else if(x<3){
		    System.out.println(1);
		}else if(x<7) System.out.println(2);
		else System.out.println(3);
		

	}
}
