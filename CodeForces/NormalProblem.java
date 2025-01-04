// https://codeforces.com/problemset/problem/2044/B

import java.util.*;
public class NormalProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            String result="";
            for(int i=n-1;i>=0;i--){
                if(s.charAt(i)=='p'){
                    result+="q";
                }else if(s.charAt(i)=='q'){
                    result+="p";
                }else{
                    result+="w";
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
