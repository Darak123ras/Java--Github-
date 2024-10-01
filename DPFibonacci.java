import java.util.*;

public class DPFibonacci {
    static ArrayList<Integer> dp;
    private static int fibonacci(int num){
        if(num<=1 ) return num;
        if(dp.get(num)!=-1) return dp.get(num);
        int temp=fibonacci(num-1)+fibonacci(num-2);
        dp.set(num, temp);
        return temp;
    }
    public static void main(String args[]){
        int n=5;
        dp = new ArrayList<>(Collections.nCopies(n + 1, -1));
        int answer=fibonacci(n);
        System.out.println(answer);
    }
    
}
