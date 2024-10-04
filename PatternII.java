/*
 * Coding problem - 2
Given an integer 
N
N - you need to generate a diamond pattern.
Check the sample input below for 
N
=
4
N=4.

   *
  ***
 *****
*******
 *****
  ***
   *
 */

public class PatternII {
    public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Update the code below this line.
        for(int i=1;i<=N;i++){
            for(int k=1;k<=N-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            // for(int l=1;l<=i+1;l++){
                
            // }
            System.out.println();
        }
        for(int i=N-1;i>=1;i--){
            for(int k=1;k<=N-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            // for(int l=1;l<=i+1;l++){
                
            // }
            System.out.println();
        }

	}
}
