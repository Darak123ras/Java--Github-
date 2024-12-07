/*
 * Problem statement
You are given an integer N. Your task is to return a 2-D ArrayList containing the pascal’s triangle till the row N.

A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. Pascal's triangle contains the values of the binomial coefficient. For example in the figure below.


For example, given integer N= 4 then you have to print.

1  
1 1 
1 2 1 
1 3 3 1

Here for the third row, you will see that the second element is the summation of the above two-row elements i.e. 2=1+1, and similarly for row three 3 = 1+2 and 3 = 1+2.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 40
1 <= N <= 50

Time Limit: 1 sec
Sample Input 1 :
3
1
2
3
Sample Output 1 :
1
1 
1 1 
1 
1 1 
1 2 1 
Explanation of The Sample Input 1:
For the first test case:
The given integer N = 1 you have to print the triangle till row 1 so you just have to output 1.

For the second test case:
The given integer N = 2 you have to print the triangle till row 2 so you have to output 
1
1 1

For the third test case
The given integer N = 3 you have to print the triangle till row 3 so you have to output 
1
1 1
1 2 1
Sample Input 2 :
3
4
5
6
Sample Output 2 :
1 
1 1 
1 2 1
1 3 3 1 
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1
1 5 10 10 5 1
 */
// Google, TCS, JP Morgan, MindTree, IBM, Capegemini



public class PascalsTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
		// Write your code here.
		ArrayList<ArrayList<Long>> list=new ArrayList<>();
		if(n==0) return list;
		// n=(long)n;
		for(int i=0;i<n;i++){
			ArrayList<Long> helper=new ArrayList<>();
			helper.add(1L);
			if(i>0){
				ArrayList<Long> x=list.get(i-1);
				for(int j=1;j<i;j++){
					helper.add(x.get(j-1)+x.get(j));
				}
				helper.add(1L);
			}
			list.add(helper);
			
		}
		return list;
	}
}
