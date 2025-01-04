import java.util.*;

public class MexTable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int mex=m+n-1;
            System.out.println(mex);
        }
        sc.close();
    }
}