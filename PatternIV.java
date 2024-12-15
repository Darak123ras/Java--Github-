/*
 * Given an integer s, write a program to print the square of size s using "*" character. 
Note: Make sure to add a " " between two "*". Add a new line after printing the square

Examples :

Input: s = 4
Output:
* * * *
*     *
*     *
* * * *
Explanation: It's a square! Each side contains s = 4 *.
Input: s = 3
Output:
* * * 
*   *
* * *
Explanation: It's a square! Each side contains s = 3 *.
Constraints:
1 ≤ s ≤ 10
 */


public class PatternIV {
    public static void square(int s) {
        // Complete the code given below
        for(int i=0;i<s;i++){
            if(i==0 || i==s-1){
                for(int j=0;j<s;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=0;j<s;j++){
                    if(j==0 || j==s-1) System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
