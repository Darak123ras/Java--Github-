
/*
 * Given an integer s. Write a program to print the Right angle triangle. The length of the perpendicular and base is s.  
Note: There is exactly single space ' ' after a start '*'. Print a new line after printing the Triangle.

Example 1:

Input: s = 9
Output:
*
* *
*   *
*     *
*       *
*         *
*           *
*             *
* * * * * * * * * 
Explanation: Length of perpendicular and base of triangle is 9.
Input: s = 4
Output:
*
* *
*   *
* * * *
Explanation: Length of perpendicular and base of triangle is 4.
Constraints:
1 ≤ s ≤ 12
 */

public class PatternIII {
    public static void triangle(int s) {

        // Write your code here
        if(s<=3){
            for(int i=0;i<s;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else {
            for(int i=0;i<s;i++){
                if(i<=1){
                    for(int j=0;j<=i;j++){
                        System.out.print("* ");
                    }
                    
                }
                if(i>1 && i<s-1){
                    for(int j=0;j<=i;j++){
                        if(j==0) System.out.print("* ");
                        else if(j==i) System.out.print("* ");
                        else System.out.print("  ");
                    }
                    
                }
                if(i==s-1){
                    for(int j=0;j<s;j++){
                         System.out.print("* ");
                    }
                }
                System.out.println();
            
            }
        }
    }
}
