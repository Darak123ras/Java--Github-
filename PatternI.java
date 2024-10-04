/*
 * Coding problem - 1
Let us solve some problems involving Nested loops.

Given an integer 
N
N - you need to generate a pyramid pattern.
Check the sample input below for 
N
=
5
N=5.

Sample 1:
Input
5
Output
        *    
       ***   
      *****  
     ******* 
    *********
 */

public class PatternI {
    public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // Update the code below this line.
        for(int i=0;i<N;i++){
            for(int k=0;k<N-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            // for(int l=1;l<=i+1;l++){
                
            // }
            System.out.println();
        }

	}
}
