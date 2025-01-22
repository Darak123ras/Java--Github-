// https://www.codechef.com/problems/WECNITK

public class AccessCodeEquality {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String code="WECNITK";
        if(code.equals(s)) System.out.println("Welcome to Web Club!");
        else System.out.println("Access denied");
	}
}
