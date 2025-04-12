/*
 * Given two integers r and c, return the value at the rth row and cth column in a Pascal's Triangle.



In Pascal's triangle:

The first row has one element with a value of 1.
Each row has one more element in it than its previous row.
The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.





Examples:
Input: r = 4, c = 2

Output: 3

Explanation: The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

....

Thus, value at row 4 and column 2 = 3

Input: r = 5, c = 3

Output: 6

Explanation: The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

1 4 6 4 1

....

Thus, value at row 5 and column 3 = 6

Input: r = 6, c = 2

Output:
2
Constraints:
1 <= r, c <= 30
c <= r
All values will fit inside a 32-bit integer.
 */

// TC: r*r
// SC: r*r

 class Solution {
    public int pascalTriangleI(int r, int c) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=r;i++){
            List<Integer> li=new ArrayList<>();
            int k=1;
            for(int j=1;j<=i;j++){
                li.add(k);
                k=k*(i-j)/j;
            }
            list.add(li);
        }
        return list.get(r-1).get(c-1);
    }
}