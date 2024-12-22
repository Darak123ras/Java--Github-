import java.util.Scanner;

public class StockSpan {
    public static void printStockSpan(int nums[],int n){
        // int k=1;
        for(int i=0;i<n;i++){
            int count=1;
            int k=i-1;
            if(i==0){
                System.out.println(count);
                continue;
            }
            while(k>=0){
                if(nums[i]<nums[k]) break;
                if(nums[i]>nums[k]){
                    count++;
                }
                k--;
            }
            System.out.println(count+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            printStockSpan(a,n);

        }
        sc.close();
    }
    
}
