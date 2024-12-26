/*
 * https://www.codechef.com/problems/WRAPGIFTS
 */

public class ChristmasGifts {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long h=sc.nextLong();//height
		    long l=sc.nextLong();//length
		    long w=sc.nextLong();//width
		    long giftArea=2*(w*l+l*h+h*w);
		    System.out.println((int)Math.floor(1000/(double)giftArea));
		}

	}
}
